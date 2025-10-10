package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SAIDValidatorGUI extends JFrame {
    private JTextField idTextField;
    private JPanel resultPanel;
    private JLabel validStatusLabel;
    private JLabel dobLabel;
    private JLabel ageLabel;
    private JLabel genderLabel;
    private JLabel citizenshipLabel;
    private JTable historyTable;
    private DefaultTableModel tableModel;
    
    private static final Color BACKGROUND_COLOR = Color.WHITE;
    private static final Color BUTTON_COLOR = new Color(55, 103, 185);
    private static final Color VALID_BACKGROUND = new Color(223, 240, 216);
    private static final Color VALID_BORDER = new Color(177, 206, 167);
    private static final Color VALID_TEXT = new Color(70, 136, 71);
    private static final Color TEXT_COLOR = new Color(60, 60, 60);
    private static final Color BORDER_COLOR = new Color(200, 200, 200);
    
    public SAIDValidatorGUI() {
        initializeGUI();
    }
    
    private void initializeGUI() {
        setTitle("SA ID Validator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(BACKGROUND_COLOR);
        
        // Main container with padding
        JPanel mainContainer = new JPanel();
        mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
        mainContainer.setBorder(new EmptyBorder(30, 40, 30, 40));
        mainContainer.setBackground(BACKGROUND_COLOR);
        
        // Title
        addTitle(mainContainer);
        
        // Input section
        addInputSection(mainContainer);
        
        // Result section
        addResultSection(mainContainer);
        
        // History section
        addHistorySection(mainContainer);
        
        add(mainContainer, BorderLayout.CENTER);
        
        // Window properties
        setSize(900, 700);
        setLocationRelativeTo(null);
        setResizable(true);
        
        // Add sample history entry
        addToHistory("8001015009087", "Valid");
    }
    
    private void addTitle(JPanel container) {
        JLabel titleLabel = new JLabel("SA ID Validator");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));
        titleLabel.setForeground(TEXT_COLOR);
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(titleLabel);
        container.add(Box.createVerticalStrut(40));
    }
    
    private void addInputSection(JPanel container) {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.setBackground(BACKGROUND_COLOR);
        inputPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        inputPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        
        // ID input field
        idTextField = createStyledTextField();
        inputPanel.add(idTextField);
        inputPanel.add(Box.createHorizontalStrut(15));
        
        // Validate button
        JButton validateButton = createValidateButton();
        inputPanel.add(validateButton);
        
        container.add(inputPanel);
        container.add(Box.createVerticalStrut(20));
    }
    
    private JTextField createStyledTextField() {
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 16));
        textField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        textField.setPreferredSize(new Dimension(500, 50));
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        
        // Placeholder functionality
        addPlaceholderBehavior(textField, "Enter ID number");
        
        return textField;
    }
    
    private void addPlaceholderBehavior(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
        
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }
    
    private JButton createValidateButton() {
        JButton button = new JButton("Validate");
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(BUTTON_COLOR);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(120, 50));
        button.setMaximumSize(new Dimension(120, 50));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateID();
            }
        });
        
        return button;
    }
    
    private void addResultSection(JPanel container) {
        resultPanel = new JPanel();
        resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
        resultPanel.setBackground(VALID_BACKGROUND);
        resultPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(VALID_BORDER, 1),
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));
        resultPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        resultPanel.setVisible(false);
        
        // Valid status with checkmark
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        statusPanel.setBackground(VALID_BACKGROUND);
        
        JLabel checkmarkLabel = createCheckmarkLabel();
        statusPanel.add(checkmarkLabel);
        
        validStatusLabel = new JLabel("Valid");
        validStatusLabel.setFont(new Font("Arial", Font.BOLD, 24));
        validStatusLabel.setForeground(VALID_TEXT);
        validStatusLabel.setBorder(new EmptyBorder(0, 15, 0, 0));
        statusPanel.add(validStatusLabel);
        
        resultPanel.add(statusPanel);
        resultPanel.add(Box.createVerticalStrut(15));
        
        // Information labels
        dobLabel = createInfoLabel();
        ageLabel = createInfoLabel();
        genderLabel = createInfoLabel();
        citizenshipLabel = createInfoLabel();
        
        resultPanel.add(dobLabel);
        resultPanel.add(Box.createVerticalStrut(8));
        resultPanel.add(ageLabel);
        resultPanel.add(Box.createVerticalStrut(8));
        resultPanel.add(genderLabel);
        resultPanel.add(Box.createVerticalStrut(8));
        resultPanel.add(citizenshipLabel);
        
        container.add(resultPanel);
        container.add(Box.createVerticalStrut(30));
    }
    
    // FIXED: Clean checkmark without weird characters
    private JLabel createCheckmarkLabel() {
        JLabel checkmark = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(VALID_TEXT);
                g2.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                
                // Draw clean checkmark
                int w = getWidth() - 8;
                int h = getHeight() - 8;
                int startX = 4;
                int startY = 4;
                
                // First line of checkmark
                g2.drawLine(startX + w/4, startY + h/2, startX + w/2, startY + h*3/4);
                // Second line of checkmark
                g2.drawLine(startX + w/2, startY + h*3/4, startX + w*3/4, startY + h/4);
                
                g2.dispose();
            }
        };
        
        checkmark.setPreferredSize(new Dimension(28, 28));
        checkmark.setMinimumSize(new Dimension(28, 28));
        checkmark.setMaximumSize(new Dimension(28, 28));
        checkmark.setOpaque(true);
        checkmark.setBackground(VALID_BACKGROUND);
        checkmark.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(VALID_TEXT, 2),
            BorderFactory.createEmptyBorder(2, 2, 2, 2)
        ));
        
        return checkmark;
    }
    
    private JLabel createInfoLabel() {
        JLabel label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setForeground(TEXT_COLOR);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        return label;
    }
    
    private void addHistorySection(JPanel container) {
        // History header
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(BACKGROUND_COLOR);
        headerPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        headerPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        
        JLabel historyLabel = new JLabel("Validation History");
        historyLabel.setFont(new Font("Arial", Font.BOLD, 24));
        historyLabel.setForeground(TEXT_COLOR);
        headerPanel.add(historyLabel, BorderLayout.WEST);
        
        JButton clearButton = createClearButton();
        headerPanel.add(clearButton, BorderLayout.EAST);
        
        container.add(headerPanel);
        container.add(Box.createVerticalStrut(15));
        
        // History table
        createHistoryTable();
        JScrollPane scrollPane = new JScrollPane(historyTable);
        scrollPane.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
        scrollPane.setPreferredSize(new Dimension(800, 200));
        scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        container.add(scrollPane);
    }
    
    private JButton createClearButton() {
        JButton button = new JButton("Clear");
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setBackground(BACKGROUND_COLOR);
        button.setForeground(TEXT_COLOR);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(8, 16, 8, 16)
        ));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearHistory();
            }
        });
        return button;
    }
    
    private void createHistoryTable() {
        String[] columnNames = {"ID Number", "Result"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        historyTable = new JTable(tableModel);
        historyTable.setFont(new Font("Arial", Font.PLAIN, 16));
        historyTable.setRowHeight(30);
        historyTable.setGridColor(new Color(240, 240, 240));
        historyTable.setBackground(BACKGROUND_COLOR);
        historyTable.setSelectionBackground(new Color(230, 240, 255));
        
        // Style header
        JTableHeader header = historyTable.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 16));
        header.setBackground(new Color(250, 250, 250));
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, BORDER_COLOR));
        header.setReorderingAllowed(false);
    }
    
    private void validateID() {
        String idNumber = idTextField.getText().trim();
        
        if (idNumber.isEmpty() || idNumber.equals("Enter ID number")) {
            showErrorMessage("Please enter an ID number");
            return;
        }
        
        boolean isValid = ValidateSaId.isIdNumberValid(idNumber);
        
        if (isValid) {
            showValidResult(idNumber);
            addToHistory(idNumber, "Valid");
        } else {
            showInvalidResult(idNumber);
            addToHistory(idNumber, "Invalid");
        }
    }
    
    private void showValidResult(String idNumber) {
        dobLabel.setText("Date of birth: " + ValidateSaId.getDateOfBirth(idNumber));
        ageLabel.setText("Age: " + ValidateSaId.getAge(idNumber));
        genderLabel.setText("Gender: " + ValidateSaId.getGender(idNumber));
        citizenshipLabel.setText("Citizenship: " + ValidateSaId.getCitizenship(idNumber));
        
        resultPanel.setVisible(true);
        revalidate();
        repaint();
    }
    
    private void showInvalidResult(String idNumber) {
        resultPanel.setVisible(false);
        showErrorMessage("Invalid ID number: " + idNumber);
        revalidate();
        repaint();
    }
    
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Validation Error", JOptionPane.WARNING_MESSAGE);
    }
    
    private void addToHistory(String idNumber, String result) {
        tableModel.insertRow(0, new Object[]{idNumber, result});
    }
    
    private void clearHistory() {
        tableModel.setRowCount(0);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SAIDValidatorGUI().setVisible(true);
            }
        });
    }
}

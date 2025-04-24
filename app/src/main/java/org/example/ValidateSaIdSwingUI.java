package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidateSaIdSwingUI extends JFrame {
    private JTextField idInputField;
    private JLabel resultLabel;
    private JLabel genderLabel;
    private JLabel dobLabel;
    private JLabel ageLabel;

    public ValidateSaIdSwingUI() {
        setTitle("SA ID Validator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440, 270);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(7, 7, 7, 7);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel promptLabel = new JLabel("Enter South African ID Number:");
        mainPanel.add(promptLabel, gbc);

        gbc.gridy++;
        idInputField = new JTextField();
        idInputField.setColumns(18);
        mainPanel.add(idInputField, gbc);

        gbc.gridx++;
        JButton validateButton = new JButton("Validate");
        mainPanel.add(validateButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        resultLabel = new JLabel(" ", SwingConstants.LEFT);
        resultLabel.setFont(resultLabel.getFont().deriveFont(Font.BOLD, 16f));
        mainPanel.add(resultLabel, gbc);

        gbc.gridy++;
        genderLabel = new JLabel(" ", SwingConstants.LEFT);
        mainPanel.add(genderLabel, gbc);

        gbc.gridy++;
        dobLabel = new JLabel(" ", SwingConstants.LEFT);
        mainPanel.add(dobLabel, gbc);

        gbc.gridy++;
        ageLabel = new JLabel(" ", SwingConstants.LEFT);
        mainPanel.add(ageLabel, gbc);

        add(mainPanel, BorderLayout.CENTER);


        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateId();
            }
        });
        idInputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateId();
            }
        });
    }

    private void validateId() {
        String id = idInputField.getText().trim();
        boolean valid = ValidateSaId.isIdNumberValid(id);
        if (valid) {
            resultLabel.setText("✅ VALID SA ID number");
            resultLabel.setForeground(new Color(0, 128, 0));
            genderLabel.setText("Gender: " + ValidateSaId.getGender(id));
            dobLabel.setText("Date of Birth: " + ValidateSaId.getDateOfBirth(id));
            int age = ValidateSaId.getAge(id);
            ageLabel.setText("Age: " + (age >= 0 ? age : "Unknown"));
        } else {
            resultLabel.setText("❌ INVALID SA ID number");
            resultLabel.setForeground(Color.RED);
            genderLabel.setText("");
            dobLabel.setText("");
            ageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ValidateSaIdSwingUI().setVisible(true);
        });
    }
}

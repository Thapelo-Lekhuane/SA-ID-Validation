<p align="center">
  <img src="public/images/logo.png" width="200" alt="SA ID Validator Logo" />
</p>

<p align="center">
  <strong>SA ID Validator</strong>
</p>

<p align="center">
  A simple Java Swing application that validates South African ID numbers based on official structure and checksum rules.
</p>

<p align="center">
  <a href="https://www.java.com/" target="_blank"><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java" /></a>
  <a href="https://gradle.org/" target="_blank"><img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" /></a>
  <a href="https://junit.org/" target="_blank"><img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit" /></a>
  <a href="https://en.wikipedia.org/wiki/Swing_(Java)" target="_blank"><img src="https://img.shields.io/badge/Java%20Swing-5382A1?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing" /></a>
</p>

<p align="center">
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/stargazers" target="_blank"><img src="https://img.shields.io/github/stars/Thapelo-Lekhuane/SA-ID-Validation?style=social" alt="Stars" /></a>
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/network" target="_blank"><img src="https://img.shields.io/github/forks/Thapelo-Lekhuane/SA-ID-Validation?style=social" alt="Forks" /></a>
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/issues" target="_blank"><img src="https://img.shields.io/github/issues/Thapelo-Lekhuane/SA-ID-Validation" alt="Issues" /></a>
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/blob/main/LICENSE" target="_blank"><img src="https://img.shields.io/github/license/Thapelo-Lekhuane/SA-ID-Validation" alt="License" /></a>
</p>

---

# 🆔 SA ID Validator

A lightweight desktop utility built using **Java Swing** and **Gradle** that validates South African ID numbers for correctness and structure based on official rules.

## 🎯 Project Overview

SA ID Validator helps users quickly verify the validity of South African ID numbers by checking:
- Correct **date of birth**
- **Gender** digits
- **Citizenship** status
- **Checksum** using the **Luhn algorithm**

It provides a simple, user-friendly **graphical interface** that instantly confirms whether an entered ID number is valid or not.

---

## ✨ Features

### 🧩 ID Validation Logic

- **Date of Birth Check** – Ensures valid `YYMMDD` date
- **Gender Identification** – Determines gender from `SSSS` digits
- **Citizenship Check** – Validates citizenship digit
- **Checksum Verification** – Uses the Luhn algorithm for accuracy
- **Instant Feedback** – Immediate validation results via GUI

### 💻 User Interface

- Built with **Java Swing**
- Lightweight and intuitive
- Error prompts for invalid inputs
- Validation feedback in real-time

---

## 🧰 Technologies Used

- **Java 17+**
- **Java Swing** (for GUI)
- **Gradle** (build automation)
- **JUnit 5** (unit testing)

---

## 🏗️ Architecture & Design

### **Application Flow**

┌────────────────────────────┐
│ Java Swing GUI │
│ (User input & validation) │
├────────────────────────────┤
│ Validation Service Layer │
│ (Performs logical checks) │
├────────────────────────────┤
│ Utility / Luhn Algorithm │
│ (Checksum validation) │
└────────────────────────────┘


### **Design Principles**

- **Separation of Concerns** – GUI and logic layers are decoupled  
- **Test-Driven Development (TDD)** – Validation logic covered by JUnit tests  
- **Modular Design** – Easy to extend for future validations  

---

## 🧠 SA ID Structure Reference

A valid South African ID number follows this format:  
`YYMMDDSSSSCAZ`

| Segment | Meaning | Example |
| -------- | -------- | ------- |
| `YYMMDD` | Date of Birth | `990228` → 28 Feb 1999 |
| `SSSS` | Gender (0000–4999 = Female, 5000–9999 = Male) | `5432` → Male |
| `C` | Citizenship (0 = SA Citizen, 1 = Permanent Resident) | `0` |
| `A` | Usually 8 (indicates race pre-1994, not used now) | `8` |
| `Z` | Checksum digit (Luhn Algorithm) | `3` |

---

## 📁 Project Structure

SA-ID-Validation/
├── app/
│ ├── src/
│ │ ├── main/java/
│ │ │ ├── ValidateSaId.java # Main validation logic
│ │ │ ├── SaIdUtils.java # Utility functions
│ │ │ └── GuiApp.java # Swing GUI entry
│ │ └── test/java/
│ │ └── ValidateSaIdTest.java # Unit tests
│ └── build.gradle # Module build config
├── gradlew / gradlew.bat # Gradle wrapper
├── settings.gradle # Root project settings
└── README.md


---

## 🚀 Quick Start

### **Prerequisites**

- Java JDK 17+ installed  
- Gradle (or use the included Gradle Wrapper)  
- Any IDE (e.g., IntelliJ, VS Code, or Eclipse)

### **Clone the Repository**


git clone https://github.com/Thapelo-Lekhuane/SA-ID-Validation.git
cd SA-ID-Validation

Run the application:
./gradlew.bat :app:run

💡 Tip: You can also build a .jar using ./gradlew build and run it directly.

**🧪 Testing
Run Unit Tests:
./gradlew test

Tests include:

✅ Valid and invalid ID numbers

✅ Luhn checksum correctness

✅ Date parsing and format validation

✅ Edge cases (leap years, non-numeric input)

🛡️ Validation Rules
Algorithmic Validation

Uses Luhn algorithm for checksum validation

Cross-checks date validity

Ensures numeric input only

Rejects shorter/longer IDs

Error Handling

Displays descriptive error messages

Prevents crashes on invalid input

Allows retry without restarting app

📄 Example Output
Input	Result	Message
9902285432083	✅ Valid	ID Number is valid
0102311234081	❌ Invalid	Invalid date of birth
9902285432084	❌ Invalid	Checksum failed
🔧 Development
Available Commands
./gradlew run         # Run the GUI
./gradlew build       # Build the app
./gradlew test        # Run unit tests

Environment
Tool	Version	Required
Java	17+	✅
Gradle	7+	✅
JUnit	5	✅
🧱 Planned Improvements (Roadmap)
Phase 1: Core Validation ✅

 Date of Birth validation

 Gender digit logic

 Citizenship validation

 Luhn checksum verification

Phase 2: GUI Enhancements 🚧

 Add dark/light mode

 Keyboard shortcuts

 Improved error popups

Phase 3: Extended Features 📋

 Bulk validation from CSV file

 Export validation results

 REST API endpoint

🤝 Contributing

Contributions are welcome!
If you’d like to improve the project, follow these steps:

Fork the repository

Create a new branch: git checkout -b feature/new-feature

Commit your changes: git commit -m "Add new feature"

Push to your fork: git push origin feature/new-feature

Open a Pull Request

📞 Support

Issues: GitHub Issues

Discussions: Coming soon

Email: thapelolekhuane.dev@gmail.com

📄 License

This project is licensed under the MIT License — see the LICENSE
 file for details.

👨‍💻 Author

Thapelo Lekhuane

GitHub: Thapelo-Lekhuane

LinkedIn: Thapelo Lekhuane

Portfolio: Coming soon

<p align="center"> ⭐️ <b>If you find this project helpful, please <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/stargazers">star it on GitHub</a>!</b> ⭐️ </p> <p align="center"> <a href="https://buymeacoffee.com/thapelo" target="_blank"><img src="https://img.shields.io/badge/Buy%20Me%20A%20Coffee-FFDD00?style=for-the-badge&logo=buy-me-a-coffee&logoColor=black" alt="Buy Me A Coffee" /></a> </p>
<p align="center"> <b>Made with ❤️ by Thapelo Lekhuane for developers and users who value accuracy.</b> </p> ```
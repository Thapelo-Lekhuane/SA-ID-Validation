
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

---

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

## 🚀 How to Run the Project

### 1. Clone the repository
```bash
git clone https://github.com/Thapelo-Lekhuane/SA-ID-Validation.git
cd SA-ID-Validation
````

### 2. Build and run the application

```bash
./gradlew.bat :app:run
```

💡 **Note:**
Make sure you have **Java 17+** and **Gradle** installed.
If you don’t, simply use the included **Gradle Wrapper** (`gradlew.bat` or `./gradlew`).

---

## 🛠 Project Structure

```plaintext
SA-ID-Validation/
├── app/
│   ├── src/
│   │   ├── main/java/
│   │   │   ├── ValidateSaId.java       # Main validation logic
│   │   │   ├── SaIdUtils.java          # Utility functions
│   │   │   └── GuiApp.java             # Swing GUI entry
│   │   └── test/java/
│   │       └── ValidateSaIdTest.java   # Unit tests
│   └── build.gradle                    # Module build config
├── gradlew / gradlew.bat               # Gradle wrapper
├── settings.gradle                     # Root project settings
└── README.md
```

---

## 📄 SA ID Format Reference

A valid South African ID number follows this format:
`YYMMDDSSSSCAZ`

| Segment | Meaning                                              |
| ------- | ---------------------------------------------------- |
| YYMMDD  | Date of birth                                        |
| SSSS    | Gender (0000–4999 = Female, 5000–9999 = Male)        |
| C       | Citizenship (0 = SA Citizen, 1 = Permanent Resident) |
| Z       | Checksum (Luhn algorithm)                            |

---

## 🙌 Credits

Developed with ❤️ by **Thapelo Lekhuane**

---

## 📬 Feedback & Contributions

Pull requests and issues are welcome!
Feel free to fork the repo and improve or expand it.

---

### 💡 Future Enhancements

* Add dark mode UI
* Include ID generation feature for testing
* Export validation logs as CSV

---

> Made with Java, Gradle, and Swing 🧩
> © 2025 Thapelo Lekhuane. All rights reserved.

````

---

✅ **After pasting this:**
```bash
git add README.md
git commit -m "docs: updated complete README.md with project structure and run guide"
git push
````

This version is **ready for GitHub**, clean, complete, and professionally formatted.

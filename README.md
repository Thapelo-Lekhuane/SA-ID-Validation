# 🆔 SA ID Validator

A simple Java desktop application built with **Java Swing** and **Gradle** that validates South African ID numbers based on official structure and checksum rules.

![Invalid Example](https://raw.githubusercontent.com/Thapelo-Lekhuane/SA-ID-Validation/main/assets/invalid_id.png)
![Valid Example](https://raw.githubusercontent.com/Thapelo-Lekhuane/SA-ID-Validation/main/assets/valid.png)

---

## ✅ Features

- 🧪 Validates 13-digit South African ID numbers
- ✅ Checks:
  - Date of birth (YYMMDD)
  - Gender digits (SSSS)
  - Citizenship
  - Luhn algorithm checksum
- 💻 Java Swing GUI for user-friendly interaction
- ✔ Instant feedback on ID validity

---

## 🧰 Technologies Used

- **Java**
- **Java Swing** (for GUI)
- **Gradle** (build tool)
- **JUnit** (unit testing)

---

## 🚀 How to Run the Project

### 1. Clone the repository
```bash
git clone https://github.com/Thapelo-Lekhuane/SA-ID-Validation.git
cd SA-ID-Validation
2. Run the application
bash
Copy
Edit
./gradlew.bat :app:run
💡 Make sure you have Java and Gradle installed, or use the Gradle Wrapper (gradlew.bat is already included).

🛠 Project Structure
css
Copy
Edit
SA-ID-Validation/
├── app/
│   ├── src/
│   │   ├── main/java/ValidateSaId.java
│   │   └── ...
│   └── build.gradle
├── settings.gradle
├── gradlew / gradlew.bat
└── README.md
📄 SA ID Format Reference
A valid SA ID number follows this format: YYMMDDSSSSCAZ


Segment	Meaning
YYMMDD	Date of birth
SSSS	Gender (0000–4999 = F, 5000–9999 = M)
C	Citizenship (0 = SA Citizen, 1 = PR)
Z	Checksum (Luhn algorithm)
🙌 Credits
Made by Thapelo Lekhuane

📬 Feedback & Contributions
Pull requests and issues are welcome! Feel free to fork the repo and improve or expand it.

yaml
Copy
Edit

---

Let me know if you'd like help with:
- Adding those screenshots to your repo (`/assets` folder).
- Creating a `.jar` file for distribution.
- Improving test coverage or validation logic.

# SA ID Validator

<p align="center">
  <img src="public/images/logo.png" width="200" alt="SA ID Validator Logo" />
</p>

<p align="center">
  <strong>Professional South African ID Validation Suite</strong>
</p>

<p align="center">
  A comprehensive Java application with GUI and web interfaces for validating South African ID numbers based on official structure, date validation, and Luhn algorithm checksum verification.
</p>

<p align="center">
  <a href="https://www.java.com/" target="_blank"><img src="https://img.shields.io/badge/Java%2021-007396?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21" /></a>
  <a href="https://gradle.org/" target="_blank"><img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" /></a>
  <a href="https://www.docker.com/" target="_blank"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" /></a>
  <a href="https://vercel.com/" target="_blank"><img src="https://img.shields.io/badge/Vercel-000000?style=for-the-badge&logo=vercel&logoColor=white" alt="Vercel" /></a>
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

## 🚀 Available Interfaces

**🖥️ Desktop Application**: Professional Java Swing GUI with Docker containerization  
**🌐 Web Application**: Modern HTML/CSS/JavaScript interface *(deployment in progress)*

---

## Project Overview

SA ID Validator is a comprehensive validation suite that provides both desktop and web interfaces for verifying South African ID numbers. The application performs complete validation including:

* **Date of Birth Verification** – Validates realistic `YYMMDD` date formats
* **Age Calculation** – Automatically calculates current age from ID
* **Gender Detection** – Determines gender from `SSSS` digit range
* **Citizenship Status** – Identifies SA Citizens vs Permanent Residents  
* **Luhn Algorithm Checksum** – Ensures mathematical validity
* **Validation History** – Tracks previous validations with persistent storage
* **Cross-Platform Support** – Works on Windows, macOS, Linux, and web browsers

---

## ✨ Features

### 🔍 Advanced Validation Engine

* **Complete SA ID Structure Validation** – All 13 digits verified according to official standards
* **Enhanced Date Validation** – Checks for realistic dates with proper month/day limits
* **Luhn Algorithm Implementation** – Industry-standard checksum verification
* **Real-time Information Extraction** – Instant age, gender, and citizenship display
* **Input Sanitization** – Handles various input formats and provides clear error messages

### 🖥️ Desktop Application (Java Swing)

* **Professional GUI Interface** – Clean, intuitive design matching modern standards
* **Real-time Validation** – Instant feedback as users type
* **Validation History Table** – Persistent record of all validations
* **Custom Visual Components** – Professional checkmarks and styled result displays
* **Keyboard Shortcuts** – Enter key validation support
* **Error Handling** – User-friendly error dialogs and validation feedback

### 🌐 Web Application

* **Responsive Design** – Works seamlessly on desktop, tablet, and mobile
* **Modern HTML5/CSS3/JavaScript** – Clean, fast, and accessible interface
* **Browser Storage** – Validation history persists using localStorage
* **Progressive Enhancement** – Works without JavaScript for basic functionality
* **Cross-Browser Compatibility** – Tested on Chrome, Firefox, Safari, and Edge

### 🐳 Containerization & Deployment

* **Docker Support** – Complete containerization for consistent deployment
* **X11 GUI Forwarding** – Desktop GUI runs in Docker with display forwarding
* **Multi-platform Docker Images** – Support for Windows, macOS, and Linux hosts
* **Vercel Ready** – Web version configured for seamless cloud deployment
* **CI/CD Ready** – Configured for continuous integration and deployment

---

## 🛠️ Technologies Used

### Backend & Core
<p>
  <a href="https://www.java.com/" target="_blank"><img src="https://img.shields.io/badge/Java%2021-007396?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21" /></a>
  <a href="https://gradle.org/" target="_blank"><img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" /></a>
  <a href="https://junit.org/" target="_blank"><img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit" /></a>
</p>

### Desktop Application
<p>
  <a href="https://en.wikipedia.org/wiki/Swing_(Java)" target="_blank"><img src="https://img.shields.io/badge/Java%20Swing-5382A1?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing" /></a>
  <a href="https://www.oracle.com/java/technologies/javase/javafx-overview.html" target="_blank"><img src="https://img.shields.io/badge/AWT-007396?style=for-the-badge&logo=java&logoColor=white" alt="AWT" /></a>
</p>

### Web Application
<p>
  <a href="https://developer.mozilla.org/en-US/docs/Web/HTML" target="_blank"><img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" /></a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/CSS" target="_blank"><img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3" /></a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank"><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" /></a>
</p>

### DevOps & Deployment
<p>
  <a href="https://www.docker.com/" target="_blank"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" /></a>
  <a href="https://vercel.com/" target="_blank"><img src="https://img.shields.io/badge/Vercel-000000?style=for-the-badge&logo=vercel&logoColor=white" alt="Vercel" /></a>
  <a href="https://github.com/" target="_blank"><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" /></a>
</p>

---

## 🚀 Quick Start

### 🖥️ Desktop Version (Docker)

#### Prerequisites
- **Docker Desktop** installed
- **X11 Server**: VcXsrv (Windows) / XQuartz (macOS) / Built-in (Linux)

#### Quick Launch
Pull and run the containerized desktop application
docker run -it --rm -e DISPLAY=host.docker.internal:0.0 sa-id-validator-desktop

For Linux users
docker run -it --rm -e DISPLAY=$DISPLAY -v /tmp/.X11-unix:/tmp/.X11-unix sa-id-validator-desktop

text

### 🌐 Web Version (Local Testing)

Clone repository and open web version
git clone https://github.com/Thapelo-Lekhuane/SA-ID-Validation.git
cd SA-ID-Validation

Open index.html in your browser
Or serve with a local server:
python -m http.server 8000

Then visit: http://localhost:8000
text

### 🛠️ Development Setup

#### 1. Clone the repository
git clone https://github.com/Thapelo-Lekhuane/SA-ID-Validation.git
cd SA-ID-Validation

text

#### 2. Run desktop application locally
Using Gradle wrapper
./gradlew :app:run

On Windows
./gradlew.bat :app:run

text

#### 3. Build Docker image
Build desktop version
docker build -t sa-id-validator-desktop .

Run with GUI forwarding
docker run -it --rm -e DISPLAY=host.docker.internal:0.0 sa-id-validator-desktop

text

---

📁 Project Structure
SA-ID-Validation/
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/java/org/example/
│       │   ├── App.java
│       │   ├── ValidateSaId.java
│       │   └── SAIDValidatorGUI.java
│       └── test/java/org/example/
│           ├── AppTest.java
│           └── ValidateSaIdTest.java
├── gradle/wrapper/
├── web-version/
│   ├── index.html
│   └── script.js
├── scripts/
├── public/images/
├── Dockerfile
├── docker-compose.yml
├── index.html
├── script.js
├── gradlew
├── settings.gradle
└── README.md

---

## 🔧 Configuration

### VcXsrv Setup (Windows)
1. Download and install [VcXsrv](https://sourceforge.net/projects/vcxsrv/)
2. Launch XLaunch with these settings:
   - **Display**: Multiple windows, Display number: 0
   - **Client**: Start no client  
   - **Extra**: ✅ **Disable access control** (Critical!)
   - **Extra**: ❌ **Native OpenGL** (Unchecked)

### XQuartz Setup (macOS)
1. Install XQuartz: `brew install --cask xquartz`
2. Start XQuartz and enable "Allow connections from network clients"
3. Install socat: `brew install socat`

---

## 📋 SA ID Format Reference

A valid South African ID number follows this format: **YYMMDDSSSSCAZ**

| Segment  | Meaning                                                      | Example |
| -------- | ------------------------------------------------------------ | ------- |
| `YYMMDD` | Date of birth (Year-Month-Day)                              | `800101` |
| `SSSS`   | Gender sequence (0000–4999 = Female, 5000–9999 = Male)      | `5009`  |
| `C`      | Citizenship (0 = SA Citizen, 1 = Permanent Resident)        | `0`     |
| `A`      | Ethnicity identifier (historically used, now typically 8-9) | `8`     |
| `Z`      | Checksum digit (calculated using Luhn algorithm)            | `7`     |

**Example**: `8001015009087`
- Born: 1980-01-01 (January 1st, 1980)
- Gender: Male (5009 ≥ 5000)
- Citizenship: SA Citizen (0)
- Age: 45 years (as of 2025)

---

## 🧪 Test Cases

### Valid Test Cases
| ID Number     | Expected Result | Details |
|---------------|----------------|---------|
| `8001015009087` | ✅ Valid | Male, 45 years, SA Citizen, Born 1980-01-01 |
| `0001010001001` | ✅ Valid | Female, 25 years, SA Citizen, Born 2000-01-01 |
| `9912311234192` | ✅ Valid | Male, 26 years, Permanent Resident, Born 1999-12-31 |

### Invalid Test Cases
| ID Number     | Expected Result | Reason |
|---------------|----------------|--------|
| `1234567890123` | ❌ Invalid | Fails Luhn checksum |
| `8013015009087` | ❌ Invalid | Invalid month (13) |
| `8001325009087` | ❌ Invalid | Invalid day (32) |
| `800101500908`  | ❌ Invalid | Too short (12 digits) |

---
📊 Entity Relationship Diagram (ERD)
erDiagram
    USER ||--o{ VALIDATION_LOG : performs

    USER {
        int user_id
        string username
        string email
        datetime created_at
    }

    VALIDATION_LOG {
        int validation_id
        int user_id
        string id_number
        string birth_date
        string gender
        string citizenship
        boolean is_valid
        datetime validated_at
    }
---

## 📈 Version History

- **v1.0.0** - Complete release with desktop GUI and web application
- **v0.3.0** - Docker containerization and X11 forwarding  
- **v0.2.0** - Professional Swing GUI with validation history
- **v0.1.0** - Core validation logic and unit tests

---

## 🤝 Contributing

We welcome contributions! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

### Development Guidelines
- Follow Java coding standards
- Add unit tests for new features  
- Update documentation for any changes
- Ensure cross-platform compatibility

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Credits

**Developed by Thapelo Lekhuane**

- **GitHub**: [@Thapelo-Lekhuane](https://github.com/Thapelo-Lekhuane)
- **LinkedIn**: [Thapelo Lekhuane](https://linkedin.com/in/thapelo-lekhuane)
- **Email**: [thapelolekhuane2@gmail.com](mailto:thapelolekhuane2@gmail.com)

---

## 🙏 Acknowledgments

- South African Department of Home Affairs for ID number format specifications
- The Java Swing community for GUI development resources
- Docker community for containerization best practices
- Vercel team for seamless web deployment platform

---

<p align="center">
  <strong>⭐ Star this repository if you find it helpful!</strong>
</p>

<p align="center">
  Made with ❤️ in South Africa
</p>

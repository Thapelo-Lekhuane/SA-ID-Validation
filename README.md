



# SA ID Validator

<p align="center">
  <img src="https://img.shields.io/badge/📇_SA_ID-VALIDATOR-2E8B57?style=for-the-badge&labelColor=20B2AA&color=2F4F4F&logoColor=white" alt="SA ID Validator" width="350"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/🇿🇦_Professional_South_African-ID_Validation_System-20B2AA?style=flat&labelColor=2E8B57&color=20B2AA" alt="Professional System"/>
</p>

<p align="center">
  A comprehensive South African ID validation system available as both a Java Swing desktop application and a modern web application.
</p>





<p align="center">
  <a href="https://www.java.com/" target="_blank"><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java" /></a>
  <a href="https://gradle.org/" target="_blank"><img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" /></a>
  <a href="https://junit.org/" target="_blank"><img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit" /></a>
  <a href="https://en.wikipedia.org/wiki/Swing_(Java)" target="_blank"><img src="https://img.shields.io/badge/Java%20Swing-5382A1?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing" /></a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/HTML" target="_blank"><img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" /></a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank"><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" /></a>
  <a href="https://www.docker.com/" target="_blank"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" /></a>
</p>

<p align="center">
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/stargazers" target="_blank"><img src="https://img.shields.io/github/stars/Thapelo-Lekhuane/SA-ID-Validation?style=social" alt="Stars" /></a>
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/network" target="_blank"><img src="https://img.shields.io/github/forks/Thapelo-Lekhuane/SA-ID-Validation?style=social" alt="Forks" /></a>
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/issues" target="_blank"><img src="https://img.shields.io/github/issues/Thapelo-Lekhuane/SA-ID-Validation" alt="Issues" /></a>
  <a href="https://github.com/Thapelo-Lekhuane/SA-ID-Validation/blob/main/LICENSE" target="_blank"><img src="https://img.shields.io/github/license/Thapelo-Lekhuane/SA-ID-Validation" alt="License" /></a>
</p>

---

## 🌐 Live Web Application

<p align="center">
  <a href="https://guileless-babka-1f8d24.netlify.app/" target="_blank">
    <img src="https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=https://guileless-babka-1f8d24.netlify.app/" alt="QR Code to Web App" />
  </a>
</p>

<p align="center">
  <strong>📱 Scan QR Code or <a href="https://guileless-babka-1f8d24.netlify.app/" target="_blank">Click Here</a> to try the Live Web Version!</strong>
</p>

<p align="center">
  <a href="https://guileless-babka-1f8d24.netlify.app/" target="_blank">
    <img src="https://img.shields.io/badge/🌐_Live_Demo-Available-brightgreen?style=for-the-badge" alt="Live Demo" />
  </a>
</p>

---

## 🚀 Quick Start Options

### 🌐 Web Version (Instant Access)
- **🔗 Live Demo**: [https://guileless-babka-1f8d24.netlify.app/](https://guileless-babka-1f8d24.netlify.app/)
- **📱 Mobile Friendly**: Works perfectly on phones and tablets
- **⚡ Features**: Professional web interface, validation history, real-time results
- **🔧 Requirements**: Any modern web browser (Chrome, Firefox, Safari, Edge)

### 🖥️ Desktop Version (Local)
- **⚙️ Requirements**: Java 11+ and Gradle
- **🖼️ Features**: Native GUI with Java Swing
- **💻 Platform**: Windows, macOS, Linux

### 🐳 Docker Version (Containerized)
- **📦 Docker Hub**: [tman25/sa-id-validator](https://hub.docker.com/r/tman25/sa-id-validator)
- **🖥️ Features**: Containerized desktop GUI with X11 forwarding
- **⚙️ Requirements**: Docker Desktop

---

## Project Overview

SA ID Validator helps users quickly verify the validity of South African ID numbers by checking:

* Correct **date of birth**
* **Gender** digits
* **Citizenship** status
* **Checksum** using the **Luhn algorithm**

Available in **three deployment options**:
1. **🌐 Web Application** - Instant access via browser at [guileless-babka-1f8d24.netlify.app](https://guileless-babka-1f8d24.netlify.app/)
2. **🖥️ Desktop Application** - Native Java Swing GUI
3. **🐳 Docker Container** - Portable containerized deployment

---

## Features

### ID Validation Logic

* **Date of Birth Check** – Ensures valid `YYMMDD` date
* **Gender Identification** – Determines gender from `SSSS` digits
* **Citizenship Check** – Validates citizenship digit
* **Checksum Verification** – Uses the Luhn algorithm for accuracy
* **Instant Feedback** – Immediate validation results

### User Interfaces

#### 🌐 Web Application ([Live Demo](https://guileless-babka-1f8d24.netlify.app/))
* **Modern responsive design** that works on desktop and mobile
* **Professional interface** with validation history table
* **Real-time validation** with detailed result display
* **Cross-platform compatibility** - works on any device with a browser
* **Instant access** - no installation required
* **24/7 availability** - always accessible

#### 🖥️ Desktop Application
* Built with **Java Swing**
* Lightweight and intuitive
* Error prompts for invalid inputs
* Native OS integration

#### 🐳 Docker Container
* **Cross-platform deployment** with GUI support
* **X11 forwarding** for Linux/macOS
* **Consistent environment** across different systems

---

## Technologies Used

<p align="center">
  <a href="https://www.java.com/" target="_blank"><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java" /></a>
  <a href="https://gradle.org/" target="_blank"><img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle" /></a>
  <a href="https://junit.org/" target="_blank"><img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit" /></a>
  <a href="https://en.wikipedia.org/wiki/Swing_(Java)" target="_blank"><img src="https://img.shields.io/badge/Java%20Swing-5382A1?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing" /></a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/HTML" target="_blank"><img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" /></a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank"><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript" /></a>
  <a href="https://www.docker.com/" target="_blank"><img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" /></a>
  <a href="https://www.netlify.com/" target="_blank"><img src="https://img.shields.io/badge/Netlify-00C7B7?style=for-the-badge&logo=netlify&logoColor=white" alt="Netlify" /></a>
</p>

---

## How to Run the Project

### 🌐 Web Version (Easiest & Recommended)

**🚀 Instant Access**: **[https://guileless-babka-1f8d24.netlify.app/](https://guileless-babka-1f8d24.netlify.app/)**

Or scan the QR code above with your mobile device! 📱

### 🖥️ Desktop Version

#### 1. Clone the repository

git clone https://github.com/Thapelo-Lekhuane/SA-ID-Validation.git
cd SA-ID-Validation

text

#### 2. Run the application

./gradlew.bat :app:run

text

**Tip:** Make sure you have Java and Gradle installed, or use the included Gradle Wrapper (`gradlew.bat`).

### 🐳 Docker Version

#### Quick Run
docker run -e DISPLAY=host.docker.internal:0.0 tman25/sa-id-validator:latest

text

#### With X11 (Linux/macOS)
Allow X11 forwarding
xhost +local:docker

Run with GUI
docker run -e DISPLAY=$DISPLAY -v /tmp/.X11-unix:/tmp/.X11-unix tman25/sa-id-validator:latest

text

---

## Deployment Options

### 🌐 Web Deployment
- **Platform**: Netlify
- **🔗 Live URL**: [https://guileless-babka-1f8d24.netlify.app/](https://guileless-babka-1f8d24.netlify.app/)
- **✨ Features**: Instant access, mobile-responsive, validation history
- **⏰ Uptime**: 24/7 availability
- **📊 Performance**: Fast loading, global CDN

### 🐳 Container Registry
- **Docker Hub**: [tman25/sa-id-validator](https://hub.docker.com/r/tman25/sa-id-validator)
- **📦 Image Size**: ~500MB
- **🖥️ Platforms**: linux/amd64, linux/arm64
- **🖼️ GUI Support**: X11 forwarding enabled

### 📂 Source Code
- **GitHub**: [Thapelo-Lekhuane/SA-ID-Validation](https://github.com/Thapelo-Lekhuane/SA-ID-Validation)
- **💻 Language**: Java 21 + JavaScript ES6
- **🔨 Build System**: Gradle
- **📄 License**: MIT

---

## Project Structure

SA-ID-Validation/
├── app/
│ ├── src/
│ │ ├── main/java/
│ │ │ ├── ValidateSaId.java # Main validation logic
│ │ │ ├── SaIdUtils.java # Utility functions
│ │ │ └── GuiApp.java # Swing GUI entry point
│ │ └── test/java/
│ │ └── ValidateSaIdTest.java # Unit tests
│ └── build.gradle # Module build config
├── web-version/ # Web application files
│ ├── index.html # Web UI
│ └── script.js # Web validation logic
├── index.html # Production web files (deployed)
├── script.js # Production web logic (deployed)
├── docker-compose.yml # Container orchestration
├── Dockerfile # Container build instructions
├── gradlew / gradlew.bat # Gradle wrapper
├── settings.gradle # Root project settings
└── README.md

text

---

## SA ID Format Reference

A valid South African ID number follows this format:
**YYMMDDSSSSCAZ**

| Segment  | Meaning                                                      |
| -------- | ------------------------------------------------------------ |
| `YYMMDD` | Date of birth                                                |
| `SSSS`   | Gender (0000–4999 = Female, 5000–9999 = Male)                |
| `C`      | Citizenship (0 = SA Citizen, 1 = Permanent Resident)         |
| `A`      | Usually 8 or 9 (indicates race historically, no longer used) |
| `Z`      | Checksum (calculated using Luhn algorithm)                   |

---

## Entity Relationship Diagram (ERD)

### Mermaid ERD

erDiagram
USER ||--o{ VALIDATION_LOG : performs
USER {
int user_id
string username
string email
}
VALIDATION_LOG {
string id_number
string birth_date
string gender
string citizenship
boolean is_valid
datetime validated_at
}

text

### ERD Summary

* Each **User** can perform multiple **ID validations**
* Each **Validation Log** stores details like ID number, gender, citizenship, and validity result
* Future upgrades could include database storage or analytics dashboards

---

## 🧪 Testing Examples

Try these test cases in the [**Live Web Version**](https://guileless-babka-1f8d24.netlify.app/):

| ID Number      | Expected Result | Details                           |
|---------------|-----------------|-----------------------------------|
| 8001015009087 | ✅ Valid        | Male, 44 years, SA Citizen      |
| 7506235016088 | ✅ Valid        | Female, 49 years, SA Citizen    |
| 9908236257080 | ✅ Valid        | Male, 26 years, SA Citizen      |
| 1234567890123 | ❌ Invalid      | Fails Luhn checksum             |
| 12345         | ❌ Invalid      | Too short (must be 13 digits)   |

**🚀 [Test them now in the live web app!](https://guileless-babka-1f8d24.netlify.app/)**

---

## Credits

Developed by **Thapelo Lekhuane**

- **GitHub**: [@Thapelo-Lekhuane](https://github.com/Thapelo-Lekhuane)
- **LinkedIn**: [Thapelo Lekhuane](https://linkedin.com/in/thapelo-lekhuane)
- **Email**: thapelolekhuane2@gmail.com
- **🌐 Live Project**: [SA ID Validator Web App](https://guileless-babka-1f8d24.netlify.app/)

---

## Feedback & Contributions

Pull requests and issues are welcome!
Feel free to fork the repo and improve or expand it.

**🌟 Star this repository if you find it useful!**

**🔗 Try the live web version: [guileless-babka-1f8d24.netlify.app](https://guileless-babka-1f8d24.netlify.app/)**

---

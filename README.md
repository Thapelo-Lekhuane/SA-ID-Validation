# 🧪 Validate South African ID Number — TDD Project

This project focuses on validating South African ID numbers using **Test Driven Development (TDD)** in **Java**, while building unit testing skills and practicing best testing practices.

---

## 📌 Why Unit Testing?

- 🐛 Helps catch bugs early  
- ✅ Ensures code works as intended  
- 🚀 Supports Test Driven Development (TDD)  

---

## 📘 Project Description

**Validate a South African ID number** by implementing a validator function that follows official ID structure and rules.

We follow the **TDD cycle**:
> RED → GREEN → REFACTOR

---

## 📂 Project Setup

### 🛠 Environment
- Language: **Java**
- Build Tool: **Gradle**

### 🔧 Gradle Setup Steps

```bash
mkdir validate_sa_id
cd validate_sa_id
gradle init
Select type: application

Language: Java

DSL: Groovy

Project name: validate_sa_id

📁 Project Structure
bash
Copy
Edit
validate_sa_id/
├── build.gradle
├── gradlew / gradlew.bat
├── settings.gradle
├── src/
│   ├── main/java/
│   │   └── ValidateSaId.java
│   └── test/java/
│       └── ValidateSaIdTest.java
💻 Main Class
java
Copy
Edit
public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        // TODO: Implement validation logic
    }
}
📄 SA ID Format — YYMMDDSSSSCAZ

Segment	Meaning
YYMMDD	Date of birth
SSSS	Gender (0000–4999 = F, 5000–9999 = M)
C	Citizenship (0 = citizen, 1 = permanent resident)
Z	Checksum (Luhn algorithm)
🧠 Validation Logic
Validate length = 13

Check all characters are digits

Validate YYMMDD as a proper date

Validate SSSS is in correct gender range

Validate citizenship digit is 0 or 1

Validate checksum using Luhn algorithm

🧪 Unit Testing Process (TDD)
Initial Tests
java
Copy
Edit
assertTrue(isIdNumberValid("2001014800086"));
assertTrue(isIdNumberValid("2909035800085"));
Next TDD Steps
❌ Test invalid length (too short / too long)

❌ Test non-digit characters

❌ Test invalid date parts (YY, MM, DD)

✅ Refactor between tests to keep code clean

📞 Example — Phone Number Validator (Pseudocode)
pseudocode
Copy
Edit
function isPhoneNumberValid(str):
  if not str starts with "27": return false
  if not all characters are digits: return false
  if length not 11: return false
  return true
📚 Resources
Java Unit Testing Best Practices - Baeldung

Unit Testing in Java - YouTube (Coding with John)

Gradle Init Guide

📦 Dependencies
Java 8+

Gradle 7+

JUnit (default with Gradle Java app template)

✅ Goal
Build strong habits in unit testing and clean code using Java and TDD, while solving a real-world validation problem.


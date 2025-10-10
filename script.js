// SA ID Validator - Complete JavaScript Implementation
// Based on Java validation logic

function validateID() {
    const idInput = document.getElementById('idNumber');
    const idNumber = idInput.value.replace(/\s/g, ''); // Remove spaces
    const resultDiv = document.getElementById('result');
    const validateBtn = document.getElementById('validateBtn');
    
    // Clear previous results
    resultDiv.innerHTML = '';
    
    // Add loading state
    validateBtn.textContent = '🔄 Validating...';
    validateBtn.disabled = true;
    
    setTimeout(() => {
        validateBtn.textContent = '🔍 Validate ID Number';
        validateBtn.disabled = false;
        
        // Basic format validation
        if (!idNumber) {
            showResult(' Please enter an ID number', 'invalid');
            return;
        }
        
        if (idNumber.length !== 13) {
            showResult(' Invalid: ID number must be exactly 13 digits', 'invalid');
            return;
        }
        
        if (!/^\d{13}$/.test(idNumber)) {
            showResult(' Invalid: ID number must contain only digits', 'invalid');
            return;
        }
        
        // Validate date of birth (first 6 digits)
        const dobString = idNumber.substring(0, 6);
        if (!isValidDate(dobString)) {
            showResult(' Invalid: Invalid date of birth in ID number', 'invalid');
            return;
        }
        
        // Validate gender digits
        const genderDigits = parseInt(idNumber.substring(6, 10));
        if (genderDigits < 0 || genderDigits > 9999) {
            showResult(' Invalid: Invalid gender digits', 'invalid');
            return;
        }
        
        // Validate citizenship digit
        const citizenship = idNumber.charAt(10);
        if (citizenship !== '0' && citizenship !== '1') {
            showResult(' Invalid: Invalid citizenship digit', 'invalid');
            return;
        }
        
        // Luhn checksum validation
        if (!luhnCheck(idNumber)) {
            showResult(' Invalid: Checksum verification failed', 'invalid');
            return;
        }
        
        // All validations passed - extract information
        const gender = getGender(idNumber);
        const dateOfBirth = getDateOfBirth(idNumber);
        const age = getAge(idNumber);
        const citizenshipStatus = getCitizenshipStatus(idNumber);
        
        showValidResult(gender, dateOfBirth, age, citizenshipStatus);
        
    }, 300);
}

function isValidDate(dobString) {
    if (dobString.length !== 6) return false;
    
    const year = parseInt(dobString.substring(0, 2));
    const month = parseInt(dobString.substring(2, 4));
    const day = parseInt(dobString.substring(4, 6));
    
    if (month < 1 || month > 12) return false;
    if (day < 1 || day > 31) return false;
    
    const daysInMonth = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    
    // Allow leap years for February
    if (month === 2 && day === 29) return true;
    
    return day <= daysInMonth[month - 1];
}

function luhnCheck(idNumber) {
    let sum = 0;
    let alternate = false;
    
    // Process from right to left
    for (let i = idNumber.length - 1; i >= 0; i--) {
        let digit = parseInt(idNumber.charAt(i));
        
        if (alternate) {
            digit *= 2;
            if (digit > 9) {
                digit = Math.floor(digit / 10) + (digit % 10);
            }
        }
        
        sum += digit;
        alternate = !alternate;
    }
    
    return (sum % 10) === 0;
}

function getGender(idNumber) {
    const genderDigits = parseInt(idNumber.substring(6, 10));
    return (genderDigits < 5000) ? 'Female' : 'Male';
}

function getDateOfBirth(idNumber) {
    const dobString = idNumber.substring(0, 6);
    const year = parseInt(dobString.substring(0, 2));
    const month = parseInt(dobString.substring(2, 4));
    const day = parseInt(dobString.substring(4, 6));
    
    // Determine century (same logic as Java version)
    const currentYear = new Date().getFullYear() % 100;
    const century = (year <= currentYear) ? 2000 : 1900;
    const fullYear = year + century;
    
    return {
        year: fullYear,
        month: month,
        day: day,
        formatted: ${String(day).padStart(2, '0')}//
    };
}

function getAge(idNumber) {
    const dob = getDateOfBirth(idNumber);
    const today = new Date();
    const birthDate = new Date(dob.year, dob.month - 1, dob.day);
    
    let age = today.getFullYear() - birthDate.getFullYear();
    const monthDiff = today.getMonth() - birthDate.getMonth();
    
    if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < birthDate.getDate())) {
        age--;
    }
    
    return age;
}

function getCitizenshipStatus(idNumber) {
    const citizenship = idNumber.charAt(10);
    return (citizenship === '0') ? 'SA Citizen' : 'Permanent Resident';
}

function showResult(message, type) {
    const resultDiv = document.getElementById('result');
    resultDiv.innerHTML = <div class="result "></div>;
}

function showValidResult(gender, dateOfBirth, age, citizenshipStatus) {
    const resultDiv = document.getElementById('result');
    
    const genderIcon = gender === 'Male' ? '' : '';
    const citizenshipIcon = citizenshipStatus === 'SA Citizen' ? '' : '';
    
    resultDiv.innerHTML = 
        <div class="result valid"> Valid South African ID Number</div>
        <div class="result info">
            <div class="info-item">
                <span class="icon"></span>
                <strong>Gender:</strong> 
            </div>
            <div class="info-item">
                <span class="icon"></span>
                <strong>Age:</strong>  years old
            </div>
            <div class="info-item">
                <span class="icon"></span>
                <strong>Date of Birth:</strong> 
            </div>
            <div class="info-item">
                <span class="icon"></span>
                <strong>Status:</strong> 
            </div>
        </div>
    ;
}

// Allow Enter key to validate
document.addEventListener('DOMContentLoaded', function() {
    const idInput = document.getElementById('idNumber');
    
    idInput.addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            validateID();
        }
    });
    
    // Format input as user types (add spaces for readability)
    idInput.addEventListener('input', function(e) {
        let value = e.target.value.replace(/\s/g, '');
        if (value.length > 13) {
            value = value.substring(0, 13);
        }
        
        // Add spaces for readability: XXX XXX XXXX XXX
        if (value.length > 6) {
            if (value.length > 10) {
                value = value.substring(0, 6) + ' ' + value.substring(6, 10) + ' ' + value.substring(10);
            } else {
                value = value.substring(0, 6) + ' ' + value.substring(6);
            }
        }
        
        e.target.value = value;
    });
});

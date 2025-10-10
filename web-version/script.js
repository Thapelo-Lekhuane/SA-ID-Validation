// SA ID Validator - Exact match to screenshot functionality

let validationHistory = [];

function validateId() {
    const idInput = document.getElementById('idInput');
    const id = idInput.value.trim();
    
    if (!id) {
        alert('Please enter an ID number');
        return;
    }
    
    const isValid = isIdNumberValid(id);
    displayResult(id, isValid);
    addToHistory(id, isValid);
    updateHistoryTable();
}

function displayResult(id, isValid) {
    const resultBox = document.getElementById('resultBox');
    const resultIcon = document.getElementById('resultIcon');
    const resultText = document.getElementById('resultText');
    const resultDetails = document.getElementById('resultDetails');
    
    resultBox.classList.add('show');
    
    if (isValid) {
        resultBox.classList.remove('invalid');
        resultIcon.classList.remove('invalid');
        resultText.classList.remove('invalid');
        
        resultIcon.textContent = '✓';
        resultText.textContent = 'Valid';
        
        // Extract and display information
        const dob = formatDateOfBirth(id);
        const age = getAge(id);
        const gender = getGender(id);
        const citizenship = getCitizenshipStatus(id);
        
        document.getElementById('dobDetail').textContent = `Date of birth: ${dob}`;
        document.getElementById('ageDetail').textContent = `Age: ${age}`;
        document.getElementById('genderDetail').textContent = `Gender: ${gender}`;
        document.getElementById('citizenshipDetail').textContent = `Citizenship: ${citizenship}`;
        
        // Remove invalid class from details
        document.querySelectorAll('.result-detail').forEach(el => {
            el.classList.remove('invalid');
        });
        
    } else {
        resultBox.classList.add('invalid');
        resultIcon.classList.add('invalid');
        resultText.classList.add('invalid');
        
        resultIcon.textContent = '✗';
        resultText.textContent = 'Invalid';
        
        document.getElementById('dobDetail').textContent = '';
        document.getElementById('ageDetail').textContent = '';
        document.getElementById('genderDetail').textContent = '';
        document.getElementById('citizenshipDetail').textContent = '';
        
        // Add invalid class to details
        document.querySelectorAll('.result-detail').forEach(el => {
            el.classList.add('invalid');
        });
    }
}

function addToHistory(id, isValid) {
    validationHistory.unshift({
        id: id,
        result: isValid ? 'Valid' : 'Invalid',
        timestamp: new Date()
    });
    
    // Keep only last 50 entries
    if (validationHistory.length > 50) {
        validationHistory = validationHistory.slice(0, 50);
    }
}

function updateHistoryTable() {
    const historyBody = document.getElementById('historyBody');
    
    if (validationHistory.length === 0) {
        historyBody.innerHTML = '<tr><td colspan="2" class="no-history">No validation history yet</td></tr>';
        return;
    }
    
    historyBody.innerHTML = validationHistory.map(entry => 
        `<tr>
            <td>${entry.id}</td>
            <td>${entry.result}</td>
        </tr>`
    ).join('');
}

function clearHistory() {
    validationHistory = [];
    updateHistoryTable();
}

// Validation logic (same as before)
function isIdNumberValid(idNumber) {
    if (!idNumber || idNumber.length !== 13) return false;
    if (!/^\d{13}$/.test(idNumber)) return false;
    
    const dob = idNumber.substring(0, 6);
    if (!isValidDate(dob)) return false;
    
    const gender = parseInt(idNumber.substring(6, 10));
    if (gender < 0 || gender > 9999) return false;
    
    const citizenship = idNumber.charAt(10);
    if (citizenship !== '0' && citizenship !== '1') return false;
    
    return luhnCheck(idNumber);
}

function isValidDate(dob) {
    if (dob.length !== 6) return false;
    
    const year = parseInt(dob.substring(0, 2));
    const month = parseInt(dob.substring(2, 4));
    const day = parseInt(dob.substring(4, 6));
    
    if (month < 1 || month > 12) return false;
    if (day < 1 || day > 31) return false;
    
    const daysInMonth = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    return day <= daysInMonth[month - 1];
}

function luhnCheck(idNumber) {
    let sum = 0;
    let alternate = false;
    
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
    return genderDigits < 5000 ? "Female" : "Male";
}

function formatDateOfBirth(idNumber) {
    const dobString = idNumber.substring(0, 6);
    const year = parseInt(dobString.substring(0, 2));
    const month = parseInt(dobString.substring(2, 4));
    const day = parseInt(dobString.substring(4, 6));
    
    const currentYear = new Date().getFullYear() % 100;
    const century = year <= currentYear ? 2000 : 1900;
    const fullYear = year + century;
    
    return `${fullYear}-${String(month).padStart(2, '0')}-${String(day).padStart(2, '0')}`;
}

function getAge(idNumber) {
    const dobString = idNumber.substring(0, 6);
    const year = parseInt(dobString.substring(0, 2));
    const month = parseInt(dobString.substring(2, 4));
    const day = parseInt(dobString.substring(4, 6));
    
    const currentYear = new Date().getFullYear() % 100;
    const century = year <= currentYear ? 2000 : 1900;
    const fullYear = year + century;
    
    const today = new Date();
    const birthDate = new Date(fullYear, month - 1, day);
    
    let age = today.getFullYear() - birthDate.getFullYear();
    const monthDiff = today.getMonth() - birthDate.getMonth();
    
    if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < birthDate.getDate())) {
        age--;
    }
    
    return age;
}

function getCitizenshipStatus(idNumber) {
    const citizenship = idNumber.charAt(10);
    return citizenship === '0' ? 'SA Citizen' : 'Permanent Resident';
}

// Enter key support
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('idInput').addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            validateId();
        }
    });
});

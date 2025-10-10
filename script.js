// SA ID Validator JavaScript
let validationHistory = JSON.parse(localStorage.getItem('validationHistory')) || [
    { id: '8001015009087', result: 'Valid' }
];

// Load history on page load
window.onload = function() {
    updateHistoryTable();
};

function validateID() {
    const idInput = document.getElementById('idInput');
    const idNumber = idInput.value.trim();
    
    if (!idNumber) {
        alert('Please enter an ID number');
        return;
    }
    
    if (idNumber.length !== 13) {
        showResult(false, 'ID number must be 13 digits');
        addToHistory(idNumber, 'Invalid - Wrong length');
        return;
    }
    
    if (!/^\d{13}$/.test(idNumber)) {
        showResult(false, 'ID number must contain only digits');
        addToHistory(idNumber, 'Invalid - Not numeric');
        return;
    }
    
    // Validate using Luhn algorithm and SA ID rules
    if (isValidSAID(idNumber)) {
        const info = extractIDInfo(idNumber);
        showResult(true, info);
        addToHistory(idNumber, 'Valid');
    } else {
        showResult(false, 'Invalid SA ID number');
        addToHistory(idNumber, 'Invalid');
    }
    
    idInput.value = '';
}

function isValidSAID(idNumber) {
    // Check date
    const dob = idNumber.substring(0, 6);
    if (!isValidDate(dob)) return false;
    
    // Luhn algorithm
    return luhnCheck(idNumber);
}

function isValidDate(dob) {
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
        let n = parseInt(idNumber.charAt(i));
        if (alternate) {
            n *= 2;
            if (n > 9) n = (n % 10) + 1;
        }
        sum += n;
        alternate = !alternate;
    }
    
    return (sum % 10 === 0);
}

function extractIDInfo(idNumber) {
    const year = parseInt(idNumber.substring(0, 2));
    const month = idNumber.substring(2, 4);
    const day = idNumber.substring(4, 6);
    
    // Determine century
    const currentYear = new Date().getFullYear() % 100;
    const fullYear = (year <= currentYear + 5) ? 2000 + year : 1900 + year;
    
    // Calculate age
    const today = new Date();
    const birthDate = new Date(fullYear, parseInt(month) - 1, parseInt(day));
    const age = today.getFullYear() - birthDate.getFullYear() - 
                (today < new Date(today.getFullYear(), birthDate.getMonth(), birthDate.getDate()) ? 1 : 0);
    
    // Determine gender
    const genderDigits = parseInt(idNumber.substring(6, 10));
    const gender = genderDigits < 5000 ? 'Female' : 'Male';
    
    // Determine citizenship
    const citizenship = idNumber.charAt(10) === '0' ? 'SA Citizen' : 'Permanent Resident';
    
    return {
        dob: \\-\-\\,
        age: age,
        gender: gender,
        citizenship: citizenship
    };
}

function showResult(isValid, info) {
    const resultDiv = document.getElementById('result');
    const resultText = document.getElementById('resultText');
    
    if (isValid && typeof info === 'object') {
        resultDiv.className = 'result valid';
        resultDiv.style.display = 'block';
        resultText.innerHTML = \
            <strong>Date of birth:</strong> \<br>
            <strong>Age:</strong> \<br>
            <strong>Gender:</strong> \<br>
            <strong>Citizenship:</strong> \
        \;
    } else {
        resultDiv.className = 'result invalid';
        resultDiv.style.display = 'block';
        resultDiv.style.background = '#f8d7da';
        resultDiv.style.border = '1px solid #f5c6cb';
        resultText.innerHTML = \<strong> Invalid:</strong> \\;
    }
}

function addToHistory(idNumber, result) {
    validationHistory.unshift({ id: idNumber, result: result });
    
    // Keep only last 10 entries
    if (validationHistory.length > 10) {
        validationHistory = validationHistory.slice(0, 10);
    }
    
    localStorage.setItem('validationHistory', JSON.stringify(validationHistory));
    updateHistoryTable();
}

function updateHistoryTable() {
    const tbody = document.getElementById('historyTable');
    tbody.innerHTML = '';
    
    validationHistory.forEach(entry => {
        const row = tbody.insertRow();
        row.insertCell(0).textContent = entry.id;
        row.insertCell(1).textContent = entry.result;
    });
}

function clearHistory() {
    validationHistory = [];
    localStorage.removeItem('validationHistory');
    updateHistoryTable();
}

// Enter key support
document.getElementById('idInput').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        validateID();
    }
});

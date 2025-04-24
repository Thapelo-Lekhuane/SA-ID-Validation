package org.example;

public class ValidateSaId {
    public static boolean isIdNumberValid(String idNumber) {
        // Check length
        if (idNumber == null || idNumber.length() != 13) return false;
        // Check all digits
        if (!idNumber.matches("\\d{13}")) return false;
        // Check date of birth
        String dob = idNumber.substring(0, 6);
        if (!isValidDate(dob)) return false;
        // Check gender
        int gender = Integer.parseInt(idNumber.substring(6, 10));
        if (gender < 0 || gender > 9999) return false;
        // Check citizenship
        char citizenship = idNumber.charAt(10);
        if (citizenship != '0' && citizenship != '1') return false;
        // Luhn checksum
        return luhnCheck(idNumber);
    }

    private static boolean isValidDate(String dob) {
        if (dob.length() != 6) return false;
        int year = Integer.parseInt(dob.substring(0, 2));
        int month = Integer.parseInt(dob.substring(2, 4));
        int day = Integer.parseInt(dob.substring(4, 6));
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && day == 29) return true; // allow leap years
        return day <= daysInMonth[month-1];
    }

    private static boolean luhnCheck(String idNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = idNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(idNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) n = (n % 10) + 1;
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public static String getGender(String idNumber) {
        if (idNumber == null || idNumber.length() != 13) return "Unknown";
        int genderDigits = Integer.parseInt(idNumber.substring(6, 10));
        return (genderDigits < 5000) ? "Female" : "Male";
    }

    public static String getDateOfBirth(String idNumber) {
        if (idNumber == null || idNumber.length() != 13) return "Unknown";
        String dob = idNumber.substring(0, 6);
        // YYMMDD
        int year = Integer.parseInt(dob.substring(0, 2));
        int month = Integer.parseInt(dob.substring(2, 4));
        int day = Integer.parseInt(dob.substring(4, 6));
        // Assume IDs are for people born between 1900 and 2099
        int currentYear = java.time.LocalDate.now().getYear() % 100;
        int century = (year <= currentYear) ? 2000 : 1900;
        year += century;
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public static int getAge(String idNumber) {
        if (idNumber == null || idNumber.length() != 13) return -1;
        String dob = getDateOfBirth(idNumber);
        try {
            java.time.LocalDate birthDate = java.time.LocalDate.parse(dob);
            java.time.Period age = java.time.Period.between(birthDate, java.time.LocalDate.now());
            return age.getYears();
        } catch (Exception e) {
            return -1;
        }
    }
}

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
}

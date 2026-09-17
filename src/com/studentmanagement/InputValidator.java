package com.studentmanagement;

public class InputValidator {

    // Validate Student ID
    public static boolean isValidStudentId(int id) {

        return id > 0;
    }

    // Validate Course ID
    public static boolean isValidCourseId(int id) {

        return id > 0;
    }

    // Validate Name
    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    // Validate Email
    public static boolean isValidEmail(String email) {

        return email != null
                && email.contains("@")
                && email.contains(".");
    }

    // Validate Phone Number
    public static boolean isValidPhone(String phone) {

        return phone != null
                && phone.matches("\\d{10}");
    }

    // Validate Marks
    public static boolean isValidMarks(double marks) {

        return marks >= 0 && marks <= 100;
    }

    // Validate Credits
    public static boolean isValidCredits(int credits) {

        return credits > 0 && credits <= 10;
    }

    // Validate Attendance
    public static boolean isValidAttendance(
            int totalClasses,
            int attendedClasses) {

        return totalClasses >= 0
                && attendedClasses >= 0
                && attendedClasses <= totalClasses;
    }

    // Validate Percentage
    public static boolean isValidPercentage(double percentage) {

        return percentage >= 0 && percentage <= 100;
    }
}
package com.studentmanagement;

public class ReportGenerator {

    public void generateStudentReport(
            Student student,
            Marks marks,
            Attendance attendance) {

        System.out.println("\n");
        System.out.println("==========================================");
        System.out.println("          STUDENT ACADEMIC REPORT");
        System.out.println("==========================================");

        System.out.println("\n---------- STUDENT DETAILS ----------");
        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Email      : " + student.getEmail());
        System.out.println("Phone      : " + student.getPhone());
        System.out.println("Course     : " + student.getCourse());

        if (marks != null) {

            double total = marks.getTotal();
            double percentage = marks.getPercentage();
            String grade = GradeCalculator.calculateGrade(percentage);
            String result = GradeCalculator.getResult(percentage);

            System.out.println("\n---------- MARKS DETAILS ----------");
            System.out.println("Subject 1  : " + marks.getSubject1());
            System.out.println("Subject 2  : " + marks.getSubject2());
            System.out.println("Subject 3  : " + marks.getSubject3());
            System.out.println("Subject 4  : " + marks.getSubject4());
            System.out.println("Subject 5  : " + marks.getSubject5());
            System.out.println("Total      : " + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade      : " + grade);
            System.out.println("Result     : " + result);

        } else {

            System.out.println("\n---------- MARKS DETAILS ----------");
            System.out.println("Marks not available.");
        }

        if (attendance != null) {

            System.out.println("\n---------- ATTENDANCE DETAILS ----------");
            System.out.println("Total Classes    : " +
                    attendance.getTotalClasses());
            System.out.println("Attended Classes : " +
                    attendance.getAttendedClasses());
            System.out.println("Attendance       : " +
                    String.format("%.2f",
                            attendance.getAttendancePercentage()) + "%");
            System.out.println("Status           : " +
                    attendance.getAttendanceStatus());

        } else {

            System.out.println("\n---------- ATTENDANCE DETAILS ----------");
            System.out.println("Attendance not available.");
        }

        System.out.println("\n==========================================");
        System.out.println("             END OF REPORT");
        System.out.println("==========================================");
    }
}
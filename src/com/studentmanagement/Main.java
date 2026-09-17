package com.studentmanagement;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        ReportGenerator reportGenerator = new ReportGenerator();
        FileManager fileManager = new FileManager();

        Student currentStudent = null;
        Marks currentMarks = null;
        Attendance currentAttendance = null;

        int choice = 0;

        do {

            System.out.println("\n==========================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("==========================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");

            System.out.println("\n6. Add Course");
            System.out.println("7. View Courses");
            System.out.println("8. Search Course");
            System.out.println("9. Update Course");
            System.out.println("10. Delete Course");

            System.out.println("\n11. Add Marks");
            System.out.println("12. Calculate Grade");
            System.out.println("13. Add Attendance");
            System.out.println("14. Generate Student Report");

            System.out.println("\n15. Exit");

            System.out.println("==========================================");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {

                System.out.println("Invalid input! Please enter a number.");

                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // ==============================
                // 1. ADD STUDENT
                // ==============================

                case 1:

                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidStudentId(studentId)) {
                        System.out.println("Student ID must be greater than 0.");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    if (!InputValidator.isValidName(name)) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    if (!InputValidator.isValidEmail(email)) {
                        System.out.println("Invalid email address.");
                        break;
                    }

                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();

                    if (!InputValidator.isValidPhone(phone)) {
                        System.out.println("Phone number must contain exactly 10 digits.");
                        break;
                    }

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    if (!InputValidator.isValidName(course)) {
                        System.out.println("Course cannot be empty.");
                        break;
                    }

                    Student student =
                            new Student(studentId, name, email, phone, course);

                    studentManager.addStudent(student);

                    currentStudent = student;

                    fileManager.saveStudent(student);

                    break;


                // ==============================
                // 2. VIEW STUDENTS
                // ==============================

                case 2:

                    studentManager.viewStudents();

                    break;


                // ==============================
                // 3. SEARCH STUDENT
                // ==============================

                case 3:

                    System.out.print("Enter Student ID to search: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID.");
                        scanner.nextLine();
                        break;
                    }

                    int searchStudentId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidStudentId(searchStudentId)) {
                        System.out.println("Student ID must be greater than 0.");
                        break;
                    }

                    studentManager.searchStudent(searchStudentId);

                    break;


                // ==============================
                // 4. UPDATE STUDENT
                // ==============================

                case 4:

                    System.out.print("Enter Student ID to update: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID.");
                        scanner.nextLine();
                        break;
                    }

                    int updateStudentId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidStudentId(updateStudentId)) {
                        System.out.println("Student ID must be greater than 0.");
                        break;
                    }

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    if (!InputValidator.isValidName(newName)) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    if (!InputValidator.isValidEmail(newEmail)) {
                        System.out.println("Invalid email address.");
                        break;
                    }

                    System.out.print("Enter New Phone: ");
                    String newPhone = scanner.nextLine();

                    if (!InputValidator.isValidPhone(newPhone)) {
                        System.out.println("Phone number must contain exactly 10 digits.");
                        break;
                    }

                    System.out.print("Enter New Course: ");
                    String newCourse = scanner.nextLine();

                    if (!InputValidator.isValidName(newCourse)) {
                        System.out.println("Course cannot be empty.");
                        break;
                    }

                    studentManager.updateStudent(
                            updateStudentId,
                            newName,
                            newEmail,
                            newPhone,
                            newCourse
                    );

                    break;


                // ==============================
                // 5. DELETE STUDENT
                // ==============================

                case 5:

                    System.out.print("Enter Student ID to delete: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID.");
                        scanner.nextLine();
                        break;
                    }

                    int deleteStudentId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidStudentId(deleteStudentId)) {
                        System.out.println("Student ID must be greater than 0.");
                        break;
                    }

                    studentManager.deleteStudent(deleteStudentId);

                    break;


                // ==============================
                // 6. ADD COURSE
                // ==============================

                case 6:

                    System.out.print("Enter Course ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID.");
                        scanner.nextLine();
                        break;
                    }

                    int courseId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidCourseId(courseId)) {
                        System.out.println("Course ID must be greater than 0.");
                        break;
                    }

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    if (!InputValidator.isValidName(courseName)) {
                        System.out.println("Course name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter Instructor Name: ");
                    String instructor = scanner.nextLine();

                    if (!InputValidator.isValidName(instructor)) {
                        System.out.println("Instructor name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter Credits: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid credits.");
                        scanner.nextLine();
                        break;
                    }

                    int credits = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidCredits(credits)) {
                        System.out.println("Credits must be between 1 and 10.");
                        break;
                    }

                    Course newCourseObject =
                            new Course(
                                    courseId,
                                    courseName,
                                    instructor,
                                    credits
                            );

                    courseManager.addCourse(newCourseObject);

                    fileManager.saveCourse(newCourseObject);

                    break;


                // ==============================
                // 7. VIEW COURSES
                // ==============================

                case 7:

                    courseManager.viewCourses();

                    break;


                // ==============================
                // 8. SEARCH COURSE
                // ==============================

                case 8:

                    System.out.print("Enter Course ID to search: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID.");
                        scanner.nextLine();
                        break;
                    }

                    int searchCourseId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidCourseId(searchCourseId)) {
                        System.out.println("Course ID must be greater than 0.");
                        break;
                    }

                    courseManager.searchCourse(searchCourseId);

                    break;


                // ==============================
                // 9. UPDATE COURSE
                // ==============================

                case 9:

                    System.out.print("Enter Course ID to update: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID.");
                        scanner.nextLine();
                        break;
                    }

                    int updateCourseId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidCourseId(updateCourseId)) {
                        System.out.println("Course ID must be greater than 0.");
                        break;
                    }

                    System.out.print("Enter New Course Name: ");
                    String updatedCourseName = scanner.nextLine();

                    if (!InputValidator.isValidName(updatedCourseName)) {
                        System.out.println("Course name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter New Instructor Name: ");
                    String updatedInstructor = scanner.nextLine();

                    if (!InputValidator.isValidName(updatedInstructor)) {
                        System.out.println("Instructor name cannot be empty.");
                        break;
                    }

                    System.out.print("Enter New Credits: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid credits.");
                        scanner.nextLine();
                        break;
                    }

                    int updatedCredits = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidCredits(updatedCredits)) {
                        System.out.println("Credits must be between 1 and 10.");
                        break;
                    }

                    courseManager.updateCourse(
                            updateCourseId,
                            updatedCourseName,
                            updatedInstructor,
                            updatedCredits
                    );

                    break;


                // ==============================
                // 10. DELETE COURSE
                // ==============================

                case 10:

                    System.out.print("Enter Course ID to delete: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Course ID.");
                        scanner.nextLine();
                        break;
                    }

                    int deleteCourseId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidCourseId(deleteCourseId)) {
                        System.out.println("Course ID must be greater than 0.");
                        break;
                    }

                    courseManager.deleteCourse(deleteCourseId);

                    break;


                // ==============================
                // 11. ADD MARKS
                // ==============================

                case 11:

                    System.out.print("Enter Student ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID.");
                        scanner.nextLine();
                        break;
                    }

                    int marksStudentId = scanner.nextInt();
                    scanner.nextLine();

                    if (!InputValidator.isValidStudentId(marksStudentId)) {
                        System.out.println("Student ID must be greater than 0.");
                        break;
                    }

                    System.out.print("Enter Subject 1 Marks: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid marks.");
                        scanner.nextLine();
                        break;
                    }

                    double subject1 = scanner.nextDouble();

                    if (!InputValidator.isValidMarks(subject1)) {
                        System.out.println("Marks must be between 0 and 100.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Enter Subject 2 Marks: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid marks.");
                        scanner.nextLine();
                        break;
                    }

                    double subject2 = scanner.nextDouble();

                    if (!InputValidator.isValidMarks(subject2)) {
                        System.out.println("Marks must be between 0 and 100.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Enter Subject 3 Marks: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid marks.");
                        scanner.nextLine();
                        break;
                    }

                    double subject3 = scanner.nextDouble();

                    if (!InputValidator.isValidMarks(subject3)) {
                        System.out.println("Marks must be between 0 and 100.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Enter Subject 4 Marks: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid marks.");
                        scanner.nextLine();
                        break;
                    }

                    double subject4 = scanner.nextDouble();

                    if (!InputValidator.isValidMarks(subject4)) {
                        System.out.println("Marks must be between 0 and 100.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Enter Subject 5 Marks: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid marks.");
                        scanner.nextLine();
                        break;
                    }

                    double subject5 = scanner.nextDouble();
                    scanner.nextLine();

                    if (!InputValidator.isValidMarks(subject5)) {
                        System.out.println("Marks must be between 0 and 100.");
                        break;
                    }

                    Marks marks =
                            new Marks(
                                    marksStudentId,
                                    subject1,
                                    subject2,
                                    subject3,
                                    subject4,
                                    subject5
                            );

                    currentMarks = marks;

                    System.out.println("\nMarks added successfully!");

                    System.out.println("Total      : " + marks.getTotal());
                    System.out.println("Percentage : " +
                            marks.getPercentage() + "%");

                    break;


                // ==============================
                // 12. CALCULATE GRADE
                // ==============================

                case 12:

                    if (currentMarks == null) {

                        System.out.println(
                                "Please add marks first."
                        );

                        break;
                    }

                    double percentage =
                            currentMarks.getPercentage();

                    String grade =
                            GradeCalculator.calculateGrade(
                                    percentage
                            );

                    String result =
                            GradeCalculator.getResult(
                                    percentage
                            );

                    System.out.println("\n========== GRADE DETAILS ==========");
                    System.out.println("Percentage : " + percentage + "%");
                    System.out.println("Grade      : " + grade);
                    System.out.println("Result     : " + result);

                    break;


                // ==============================
                // 13. ADD ATTENDANCE
                // ==============================

                case 13:

                    System.out.print("Enter Student ID: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid Student ID.");
                        scanner.nextLine();
                        break;
                    }

                    int attendanceStudentId =
                            scanner.nextInt();

                    scanner.nextLine();

                    if (!InputValidator.isValidStudentId(
                            attendanceStudentId)) {

                        System.out.println(
                                "Student ID must be greater than 0."
                        );

                        break;
                    }

                    System.out.print("Enter Total Classes: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid total classes.");
                        scanner.nextLine();
                        break;
                    }

                    int totalClasses =
                            scanner.nextInt();

                    System.out.print("Enter Attended Classes: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid attended classes.");
                        scanner.nextLine();
                        break;
                    }

                    int attendedClasses =
                            scanner.nextInt();

                    scanner.nextLine();

                    if (!InputValidator.isValidAttendance(
                            totalClasses,
                            attendedClasses)) {

                        System.out.println(
                                "Invalid attendance data."
                        );

                        break;
                    }

                    Attendance attendance =
                            new Attendance(
                                    attendanceStudentId,
                                    totalClasses,
                                    attendedClasses
                            );

                    currentAttendance = attendance;

                    System.out.println(
                            "\nAttendance added successfully!"
                    );

                    System.out.println(
                            "Attendance : " +
                            String.format(
                                    "%.2f",
                                    attendance.getAttendancePercentage()
                            ) + "%"
                    );

                    System.out.println(
                            "Status     : " +
                            attendance.getAttendanceStatus()
                    );

                    break;


                // ==============================
                // 14. GENERATE REPORT
                // ==============================

                case 14:

                    if (currentStudent == null) {

                        System.out.println(
                                "Please add a student first."
                        );

                        break;
                    }

                    reportGenerator.generateStudentReport(
                            currentStudent,
                            currentMarks,
                            currentAttendance
                    );

                    saveReportToFile(
                            currentStudent,
                            currentMarks,
                            currentAttendance
                    );

                    break;


                // ==============================
                // 15. EXIT
                // ==============================

                case 15:

                    System.out.println(
                            "\nThank you for using Student Management System!"
                    );

                    break;


                // ==============================
                // INVALID CHOICE
                // ==============================

                default:

                    System.out.println(
                            "Invalid choice! Please select 1 to 15."
                    );
            }

        } while (choice != 15);

        scanner.close();
    }


    // ==========================================
    // SAVE ACADEMIC REPORT TO FILE
    // ==========================================

    public static void saveReportToFile(
            Student student,
            Marks marks,
            Attendance attendance) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "data/academic_report.txt"
                    );

            writer.write(
                    "==========================================\n"
            );

            writer.write(
                    "          STUDENT ACADEMIC REPORT\n"
            );

            writer.write(
                    "==========================================\n\n"
            );

            writer.write(
                    "---------- STUDENT DETAILS ----------\n"
            );

            writer.write(
                    "Student ID : " +
                    student.getStudentId() + "\n"
            );

            writer.write(
                    "Name       : " +
                    student.getName() + "\n"
            );

            writer.write(
                    "Email      : " +
                    student.getEmail() + "\n"
            );

            writer.write(
                    "Phone      : " +
                    student.getPhone() + "\n"
            );

            writer.write(
                    "Course     : " +
                    student.getCourse() + "\n"
            );


            if (marks != null) {

                double total = marks.getTotal();

                double percentage =
                        marks.getPercentage();

                String grade =
                        GradeCalculator.calculateGrade(
                                percentage
                        );

                String result =
                        GradeCalculator.getResult(
                                percentage
                        );

                writer.write(
                        "\n---------- MARKS DETAILS ----------\n"
                );

                writer.write(
                        "Subject 1  : " +
                        marks.getSubject1() + "\n"
                );

                writer.write(
                        "Subject 2  : " +
                        marks.getSubject2() + "\n"
                );

                writer.write(
                        "Subject 3  : " +
                        marks.getSubject3() + "\n"
                );

                writer.write(
                        "Subject 4  : " +
                        marks.getSubject4() + "\n"
                );

                writer.write(
                        "Subject 5  : " +
                        marks.getSubject5() + "\n"
                );

                writer.write(
                        "Total      : " +
                        total + "\n"
                );

                writer.write(
                        "Percentage : " +
                        percentage + "%\n"
                );

                writer.write(
                        "Grade      : " +
                        grade + "\n"
                );

                writer.write(
                        "Result     : " +
                        result + "\n"
                );

            } else {

                writer.write(
                        "\n---------- MARKS DETAILS ----------\n"
                );

                writer.write(
                        "Marks not available.\n"
                );
            }


            if (attendance != null) {

                writer.write(
                        "\n---------- ATTENDANCE DETAILS ----------\n"
                );

                writer.write(
                        "Total Classes    : " +
                        attendance.getTotalClasses() + "\n"
                );

                writer.write(
                        "Attended Classes : " +
                        attendance.getAttendedClasses() + "\n"
                );

                writer.write(
                        "Attendance       : " +
                        String.format(
                                "%.2f",
                                attendance.getAttendancePercentage()
                        ) + "%\n"
                );

                writer.write(
                        "Status           : " +
                        attendance.getAttendanceStatus() + "\n"
                );

            } else {

                writer.write(
                        "\n---------- ATTENDANCE DETAILS ----------\n"
                );

                writer.write(
                        "Attendance not available.\n"
                );
            }


            writer.write(
                    "\n==========================================\n"
            );

            writer.write(
                    "             END OF REPORT\n"
            );

            writer.write(
                    "==========================================\n"
            );

            writer.close();

            System.out.println(
                    "\nAcademic report saved successfully!"
            );

        } catch (IOException e) {

            System.out.println(
                    "Error while saving academic report."
            );
        }
    }
}

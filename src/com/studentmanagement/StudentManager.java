package com.studentmanagement;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student student : students) {
            System.out.println(student);
            System.out.println("----------------------------------");
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {
                System.out.println("\n========== STUDENT FOUND ==========");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update Student
    public void updateStudent(
            int id,
            String name,
            String email,
            String phone,
            String course) {

        for (Student student : students) {

            if (student.getStudentId() == id) {

                student.setName(name);
                student.setEmail(email);
                student.setPhone(phone);
                student.setCourse(course);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId() == id) {

                students.remove(i);

                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
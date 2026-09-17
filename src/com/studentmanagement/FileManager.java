package com.studentmanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    private final String dataFolder = "data";

    public FileManager() {

        File folder = new File(dataFolder);

        if (!folder.exists()) {
            folder.mkdir();
        }
    }

    // Save student information
    public void saveStudent(Student student) {

        try {

            FileWriter writer =
                    new FileWriter(dataFolder + "/students.txt", true);

            writer.write("----------------------------------------\n");
            writer.write("Student ID : " + student.getStudentId() + "\n");
            writer.write("Name       : " + student.getName() + "\n");
            writer.write("Email      : " + student.getEmail() + "\n");
            writer.write("Phone      : " + student.getPhone() + "\n");
            writer.write("Course     : " + student.getCourse() + "\n");
            writer.write("----------------------------------------\n");

            writer.close();

            System.out.println("Student data saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "Error while saving student data."
            );
        }
    }

    // Save course information
    public void saveCourse(Course course) {

        try {

            FileWriter writer =
                    new FileWriter(dataFolder + "/courses.txt", true);

            writer.write("----------------------------------------\n");
            writer.write("Course ID  : " + course.getCourseId() + "\n");
            writer.write("Course Name: " + course.getCourseName() + "\n");
            writer.write("Instructor : " + course.getInstructor() + "\n");
            writer.write("Credits    : " + course.getCredits() + "\n");
            writer.write("----------------------------------------\n");

            writer.close();

            System.out.println("Course data saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "Error while saving course data."
            );
        }
    }

    // Save academic report
    public void saveReport(String report) {

        try {

            FileWriter writer =
                    new FileWriter(dataFolder + "/academic_report.txt");

            writer.write(report);

            writer.close();

            System.out.println("Academic report saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "Error while saving academic report."
            );
        }
    }
}
package com.studentmanagement;

import java.util.ArrayList;

public class CourseManager {

    private ArrayList<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    // Add Course
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully!");
    }

    // View Courses
    public void viewCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\n========== COURSE LIST ==========");

        for (Course course : courses) {
            System.out.println(course);
            System.out.println("----------------------------------");
        }
    }

    // Search Course
    public void searchCourse(int id) {

        for (Course course : courses) {

            if (course.getCourseId() == id) {
                System.out.println("\n========== COURSE FOUND ==========");
                System.out.println(course);
                return;
            }
        }

        System.out.println("Course not found.");
    }

    // Update Course
    public void updateCourse(
            int id,
            String courseName,
            String instructor,
            int credits) {

        for (Course course : courses) {

            if (course.getCourseId() == id) {

                course.setCourseName(courseName);
                course.setInstructor(instructor);
                course.setCredits(credits);

                System.out.println("Course updated successfully!");
                return;
            }
        }

        System.out.println("Course not found.");
    }

    // Delete Course
    public void deleteCourse(int id) {

        for (int i = 0; i < courses.size(); i++) {

            if (courses.get(i).getCourseId() == id) {

                courses.remove(i);

                System.out.println("Course deleted successfully!");
                return;
            }
        }

        System.out.println("Course not found.");
    }
}
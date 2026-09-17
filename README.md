# Student Management & Academic Record System (SMARS)

## 1. Project Overview

Student Management & Academic Record System (SMARS) is a Java-based console application designed to manage student academic information in an organized and efficient way.

The system allows users to manage student details, courses, marks, grades, attendance and academic reports. It also provides input validation and file-based data storage.

The project is developed using Core Java concepts such as classes and objects, encapsulation, ArrayList, methods, conditional statements, loops, exception handling and file handling.

## 2. Problem Statement

Managing student academic records manually can be time-consuming and may lead to errors in storing, updating and calculating academic information.

The purpose of this project is to develop a simple Student Management System that can store and manage student details, course information, marks, attendance and academic performance.

The system reduces manual work and provides a structured way to manage student academic records.

## 3. Objectives

The main objectives of the project are:

- To manage student personal information.
- To manage course information.
- To record and calculate student marks.
- To calculate percentage and grades automatically.
- To manage student attendance.
- To generate complete academic reports.
- To validate user input and reduce incorrect data.
- To save important information using files.
- To provide a simple and user-friendly console interface.

## 4. Main Features

### Student Management

- Add student
- View students
- Search student
- Update student
- Delete student

### Course Management

- Add course
- View courses
- Search course
- Update course
- Delete course

### Marks & Grade Management

- Add marks for five subjects
- Calculate total marks
- Calculate percentage
- Calculate grade
- Display pass/fail result

### Attendance Management

- Record total classes
- Record attended classes
- Calculate attendance percentage
- Display attendance eligibility status

### Academic Report

- Display student details
- Display marks
- Display percentage
- Display grade
- Display result
- Display attendance
- Save academic report to a file

### Validation

The system validates:

- Student ID
- Course ID
- Name
- Email
- Phone number
- Marks
- Credits
- Attendance data
- Menu choices

## 5. Technologies Used

- Programming Language: Java
- Development Environment: Visual Studio Code
- Java Version: JDK 26
- Data Structure: ArrayList
- Storage: Text Files
- Version Control: Git and GitHub

## 6. Project Structure

```text
StudentManagementSystem
│
├── README.md
│
├── data
│   ├── students.txt
│   ├── courses.txt
│   └── academic_report.txt
│
└── src
    └── com
        └── studentmanagement
            ├── Main.java
            ├── Student.java
            ├── StudentManager.java
            ├── Course.java
            ├── CourseManager.java
            ├── Marks.java
            ├── GradeCalculator.java
            ├── Attendance.java
            ├── ReportGenerator.java
            ├── FileManager.java
            └── InputValidator.java
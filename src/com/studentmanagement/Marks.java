package com.studentmanagement;

public class Marks {

    private int studentId;
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;
    private double subject5;

    public Marks(int studentId, double subject1, double subject2,
                 double subject3, double subject4, double subject5) {

        this.studentId = studentId;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getSubject1() {
        return subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public double getSubject3() {
        return subject3;
    }

    public double getSubject4() {
        return subject4;
    }

    public double getSubject5() {
        return subject5;
    }

    public double getTotal() {
        return subject1 + subject2 + subject3 + subject4 + subject5;
    }

    public double getPercentage() {
        return getTotal() / 5;
    }

    @Override
    public String toString() {
        return "Student ID : " + studentId +
               "\nSubject 1  : " + subject1 +
               "\nSubject 2  : " + subject2 +
               "\nSubject 3  : " + subject3 +
               "\nSubject 4  : " + subject4 +
               "\nSubject 5  : " + subject5 +
               "\nTotal      : " + getTotal() +
               "\nPercentage : " + getPercentage() + "%";
    }
}
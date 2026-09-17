package com.studentmanagement;

public class Attendance {

    private int studentId;
    private int totalClasses;
    private int attendedClasses;

    public Attendance(int studentId, int totalClasses, int attendedClasses) {

        this.studentId = studentId;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public double getAttendancePercentage() {

        if (totalClasses == 0) {
            return 0;
        }

        return (attendedClasses * 100.0) / totalClasses;
    }

    public String getAttendanceStatus() {

        if (getAttendancePercentage() >= 75) {
            return "ELIGIBLE";
        } else {
            return "SHORT ATTENDANCE";
        }
    }

    @Override
    public String toString() {

        return "Student ID          : " + studentId +
               "\nTotal Classes       : " + totalClasses +
               "\nAttended Classes    : " + attendedClasses +
               "\nAttendance          : " +
               String.format("%.2f", getAttendancePercentage()) + "%" +
               "\nStatus              : " + getAttendanceStatus();
    }
}
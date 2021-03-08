package com.springcore;

public class StudentBean {

    @Override
    public String toString() {
        return "StudentBean{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + '}';
    }

    private int studentId;
    private String studentName;
    private String studentAddress;

    public StudentBean(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

}

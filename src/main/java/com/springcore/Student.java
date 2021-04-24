package com.springcore;

import org.springframework.stereotype.Component;

//@Component
public class Student {

    public AdmissionDetails admissionDetails;
    private float marks;

    public Student(AdmissionDetails admissionDetails) {
        this.admissionDetails = admissionDetails;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void study() {
        System.out.println("Student Is Reading This Code");
    }
}

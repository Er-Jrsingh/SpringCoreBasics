package com.springcore;

public class AdmissionDetails {
    private final String rollNo = "195911";
    private final Double feePaid = 24000.00 + 1500.00;

    @Override
    public String toString() {
        return "AdmissionDetails{" +
                "rollNo='" + rollNo + '\'' +
                ", feePaid=" + feePaid +
                '}';
    }
}

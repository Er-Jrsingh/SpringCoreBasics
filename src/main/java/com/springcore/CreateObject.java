package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CreateObject {

    @Value("#{new com.springcore.Student()}")
    public Student student;

    @Value("#{1>-1}")
    public boolean isPassOut;

    @Value("#{1<-1}")
    public boolean hasAnyBack;

    @Override
    public String toString() {
        return "CreateObject{" +
                "student=" + student +
                ", isPassOut=" + isPassOut +
                ", hasAnyBack=" + hasAnyBack +
                '}';
    }
}

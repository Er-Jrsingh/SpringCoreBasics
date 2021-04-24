package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore")
public class AnnotConfig {

    @Bean
    public AdmissionDetails getAdmissionDetails(){
        AdmissionDetails details=new AdmissionDetails();
        return details;
    }
    @Bean(name = {"stu","student","temp"})              //We can Give Multiple Name To Bean Like This
    public Student getStudent() {
        Student student = new Student(getAdmissionDetails());
        return student;
    }
}

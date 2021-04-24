package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotConfig.class);
        Student student = context.getBean("stu", Student.class);
        student.setMarks(95.52f);

        student.study();
        System.out.println(student.getMarks());
        System.out.println(student.admissionDetails);
        System.out.println(student);
    }

}

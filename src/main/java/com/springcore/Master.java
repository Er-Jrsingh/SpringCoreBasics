package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AnnotConfig.class);
        Student student=context.getBean("student",Student.class);
        student.study();
        System.out.println(student);
    }

}

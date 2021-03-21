package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Students {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation_config.xml");

//        StuName beanObject = (StuName) context.getBean("stuNameObject");
//        StuName beanObject = context.getBean("stuNameObject", StuName.class);     // Auto Casting  
        com.springcore.annotation.StuName beanObject = context.getBean("stuNameObject", com.springcore.annotation.StuName.class);     // Auto Casting  

        System.out.println(beanObject);

        System.out.println(beanObject.getRollObj().getRollNo());
    }

}

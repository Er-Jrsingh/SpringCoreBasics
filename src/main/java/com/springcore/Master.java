package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext con = new ClassPathXmlApplicationContext("stereo_config.xml");

        StudentBean stu = con.getBean("studentBean", StudentBean.class);
        System.out.println(stu);

    }
}

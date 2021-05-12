package com.springcore;

import com.springcore.dao.StudentDao;
import com.springcore.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
        Student student = new Student(2, "Jitu Thakur", "Bilaspur");
        int rs = studentDao.insert(student);

        System.out.println(rs);
    }

}

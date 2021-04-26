package com.springcore;


import com.springcore.dao.StudentDao;
import com.springcore.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("daoImpl", StudentDao.class);

        Student student = new Student();
        student.setId(101);
        student.setName("Jitu Thakur");
        student.setCity("Korba");

        int result = studentDao.insert(student);

        System.out.println("Student Inserted....." + result);

    }
}

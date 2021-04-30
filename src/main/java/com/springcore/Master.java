package com.springcore;


import com.springcore.dao.StudentDao;
import com.springcore.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("daoImpl", StudentDao.class);

        System.out.println("*************************** Insert Query ****************************");
        Student student = new Student();
        student.setId(103);
        student.setName("Jitesh Singh Thakur");
        student.setCity("India");

        int result = studentDao.insert(student);

        System.out.println("Student Inserted....." + result);

        System.out.println("*************************** Update Query ****************************");

        Student student2 = new Student();
        student2.setId(103);
        student2.setName("Jitesh Singh Thakur");
        student2.setCity("India");

        int result2 = studentDao.update(student2);

        System.out.println("Student Updated....." + result2);


        System.out.println("*************************** Delete Query ****************************");

        int result3 = studentDao.delete(103);

        System.out.println("Student Deleted....." + result3);

        System.out.println("*************************** Single Row Select Query ****************************");

        Student student3 = studentDao.getStudent(102);

        System.out.println("Student Deleted....." + student3.getId());
        System.out.println("Student Deleted....." + student3.getName());
        System.out.println("Student Deleted....." + student3.getCity());

        System.out.println("*************************** Multiple Row Select Query ****************************");

        List<Student> student4 = studentDao.getAllStudent();

        for (Student s : student4) {
            System.out.println("Student Id....." + s.getId());
            System.out.println("Student Name....." + s.getName());
            System.out.println("Student City....." + s.getCity());
            System.out.println("-----------***-------------");
        }
    }
}

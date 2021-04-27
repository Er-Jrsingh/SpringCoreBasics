package com.springcore;


import com.springcore.dao.StudentDao;
import com.springcore.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("daoImpl", StudentDao.class);

        System.out.println("*************************** Insert Query ****************************");
        Student student = new Student();
        student.setId(103);
        student.setName("Jitu Thakur");
        student.setCity("Korba");

        int result = studentDao.insert(student);

        System.out.println("Student Inserted....." + result);

        System.out.println("*************************** Update Query ****************************");

        Student student2 = new Student();
        student2.setId(103);
        student2.setName("Jitesh Thakur");
        student2.setCity("Bilaspur");

        int result2 = studentDao.update(student2);

        System.out.println("Student Inserted....." + result2);


        System.out.println("*************************** Delete Query ****************************");

        int result3 = studentDao.delete(103);

        System.out.println("Student Deleted....." + result3);
    }
}

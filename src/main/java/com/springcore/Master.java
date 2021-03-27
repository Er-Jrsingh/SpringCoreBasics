package com.springcore;

import com.springcore.collection.StudentDetailsBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("collection_config.xml");

        System.out.println("-------------------------------------*** First Bean ***----------------------------------------------");

        StudentDetailsBean beanObject = (StudentDetailsBean) context.getBean("StuDetails");
        System.out.println(beanObject);

        System.out.println("Type Of List : " + beanObject.getPhones().getClass().getName());
        System.out.println("Type Of Set : " + beanObject.getAdresses().getClass().getName());
        System.out.println("Type Of Map : " + beanObject.getCourses().getClass().getName());

        System.out.println("----------------------------*** Create 2 Object With Data By Java ***--------------------------------");

        StudentDetailsBean beanObject3 = (StudentDetailsBean) context.getBean("StuDetails");
        System.out.println(beanObject3);

        System.out.println("Type Of List : " + beanObject3.getPhones().getClass().getName());
        System.out.println("Type Of Set : " + beanObject3.getAdresses().getClass().getName());
        System.out.println("Type Of Map : " + beanObject3.getCourses().getClass().getName());

        System.out.println("-------------------------------------*** Second Bean ***----------------------------------------------");

        StudentDetailsBean beanObject2 = (StudentDetailsBean) context.getBean("StuDetails2");
        System.out.println(beanObject2);

        System.out.println("Type Of List : " + beanObject2.getPhones().getClass().getName());
        System.out.println("Type Of Set : " + beanObject2.getAdresses().getClass().getName());
        System.out.println("Type Of Map : " + beanObject2.getCourses().getClass().getName());

    }

}

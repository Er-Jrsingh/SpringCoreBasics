package com.springcore;

import com.springcore.collection.StudentDetailsBean;
import com.springcore.object.StuName;
import com.springcore.property_inject.DbConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Students {

    public static void main(String[] args) {

        System.out.println("-------------------***Primitive Injection***--------------------------------");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentBean beanObject = (StudentBean) context.getBean("stuBean");
        System.out.println(beanObject);

        StudentBean beanObject2 = (StudentBean) context.getBean("stuBean2");
        System.out.println(beanObject2);

        System.out.println("-------------------***Collection Injection***--------------------------------");

        ApplicationContext detailsBeanContext = new ClassPathXmlApplicationContext("collection_config.xml");
        StudentDetailsBean detailsBean = (StudentDetailsBean) detailsBeanContext.getBean("StuDetails");
        System.out.println(detailsBean);

        System.out.println("-------------------***Object Injection***--------------------------------");

        ApplicationContext stuNameContext = new ClassPathXmlApplicationContext("obj_config.xml");
        StuName stuNameObj = (StuName) stuNameContext.getBean("stuNameObject");
        System.out.println(stuNameObj);

        System.out.println(stuNameObj.getName());
        System.out.println(stuNameObj.getRollObj().getRollNo());

        System.out.println("-------------------***Properties Injection***--------------------------------");

        ApplicationContext DbConfigContext = new ClassPathXmlApplicationContext("property_config.xml");
        DbConfig dbConfigObj = (DbConfig) DbConfigContext.getBean("dbCon");
        System.out.println(dbConfigObj);

    }

}

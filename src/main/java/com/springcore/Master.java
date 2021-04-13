package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++++Primitive+++++++++++++++++++++++++++");

//        ApplicationContext con = new ClassPathXmlApplicationContext("stereo_config.xml");
//
//        StudentBean stu = con.getBean("studentBean", StudentBean.class);
//        System.out.println(stu);
        System.out.println("+++++++++++++++++++++Collection+++++++++++++++++++++++++++");

//        ApplicationContext collection = new ClassPathXmlApplicationContext("stereo_collection_config.xml");
//
//        StudentBeanCollection stuColl = collection.getBean("studentBeanCollection", StudentBeanCollection.class);
//        System.out.println(stuColl);
//        
        System.out.println("+++++++++++++++++++++Scope(By Default Singleton )+++++++++++++++++++++++++++");

        ApplicationContext scope = new ClassPathXmlApplicationContext("stereo_scope_config.xml");

        StudentBeanScope stuScope = scope.getBean("studentBeanScope", StudentBeanScope.class);
        System.out.println("Hash Code is : " + stuScope.hashCode());

        StudentBeanScope stuScope2 = scope.getBean("studentBeanScope", StudentBeanScope.class);
        System.out.println("Hash Code is : " + stuScope2.hashCode());

    }
}

package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++++++++++++    By Xml  ++++++++++++++++++++++++++++++++++++++++++++++");

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee emp = (Employee) context.getBean("Emp");

        System.out.println(emp);

        context.registerShutdownHook(); //Helps To Call Destroy Method
//        context.destroy();

        System.out.println("+++++++++++++++++++++++++++++++++++++   By Interface    +++++++++++++++++++++++++++++++++++++++++++");

        ApplicationContext Interfacecontext = new ClassPathXmlApplicationContext("config.xml");

        Customers customers = (Customers) Interfacecontext.getBean("Customer");

        System.out.println(customers);

        System.out.println("+++++++++++++++++++++++++++++++++++++   By Annotation    +++++++++++++++++++++++++++++++++++++++++++++++");

        ApplicationContext productContext = new ClassPathXmlApplicationContext("config.xml");

        Products products = (Products) productContext.getBean("products");

        System.out.println(products);

    }

}

package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee emp = (Employee) context.getBean("Emp");

        System.out.println(emp);

        context.registerShutdownHook(); //Helps To Call Destroy Method
//        context.destroy();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        AbstractApplicationContext Interfacecontext = new ClassPathXmlApplicationContext("config.xml");

        Customers customers = (Customers) Interfacecontext.getBean("Customer");

        System.out.println(customers);

    }

}

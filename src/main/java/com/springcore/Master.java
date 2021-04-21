package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        System.out.println("************************************ Parsing By SePL(annotation) *******************************************************");
        Student stu = context.getBean("student", Student.class);

        System.out.println(stu);

        System.out.println("************************************ Custom Parsing By Object *******************************************************");

        SpelExpressionParser parse = new SpelExpressionParser();

        Expression exp = parse.parseExpression("22+3*6/8");

        System.out.println(exp.getValue());

    }

}

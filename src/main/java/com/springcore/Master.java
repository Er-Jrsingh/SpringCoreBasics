package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Master {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//        Insert Query
        String query = "insert into student(id,name,city) values(?,?,?)";
//        Fire Query
        int result = template.update(query, 2, "Bonjour", "bonsor");

        System.out.println("Number Of Record Inserted....." + result);

    }
}

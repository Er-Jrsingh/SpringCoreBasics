package com.springcore;

import com.springcore.dao.StudentDao;
import com.springcore.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

    @Bean(name = {"ds"})
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getTemplate() {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    @Bean(name = {"daoImpl"})
    public StudentDao getStudentDao() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(getTemplate());
        return studentDao;
    }
}

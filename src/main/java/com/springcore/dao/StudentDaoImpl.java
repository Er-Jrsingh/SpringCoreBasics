package com.springcore.dao;

import com.springcore.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {

        //        Insert Query
        String query = "insert into student(id,name,city) values(?,?,?)";
        //        Fire Query
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    @Override
    public int update(Student student) {
//        Update Query
        String query = "update student set name=? , city=? where id=?";
//        fire Query
        int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }

    @Override
    public int delete(int studentId) {
//        delete Query
        String query = "delete from student where id=?";
//        fire Query
        int result = this.jdbcTemplate.update(query, studentId);
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

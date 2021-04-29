package com.springcore.dao;

import com.springcore.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

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

    @Override
    public Student getStudent(int studentId) {
//        Select Single Row
        String query = "select * from student where id = ?";
//        RowMapper<Student> rowMapper = new RowMapperImpl();
//        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

//        Using Anonymous Class
        Student student = this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setCity(resultSet.getString(3));
                return student;
            }
        }, studentId);
        return student;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

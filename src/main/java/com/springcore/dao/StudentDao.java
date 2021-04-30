package com.springcore.dao;

import com.springcore.entities.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);

    int update(Student student);

    int delete(int studentId);

    Student getStudent(int studentId);

    List<Student> getAllStudent();
}

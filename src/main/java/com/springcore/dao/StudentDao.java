package com.springcore.dao;

import com.springcore.entities.Student;

public interface StudentDao {
    int insert(Student student);

    int update(Student student);

    int delete(int studentId);
}

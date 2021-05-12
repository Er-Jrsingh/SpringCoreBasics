package com.springcore.dao;

import com.springcore.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    //    Crate Row
    @Transactional
    public int insert(Student student) {
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    //    Get The Single Row(Object)
    public Student getStudent(int studentId) {
        Student student = hibernateTemplate.get(Student.class, studentId);
        return student;
    }

    //    Get The All Row(Object)
    public List<Student> getAllStudent() {
        List<Student> student = hibernateTemplate.loadAll(Student.class);
        return student;
    }

    //    Update
    @Transactional
    public void updateStudent(Student student) {
        hibernateTemplate.update(student);
    }

    //    Delete Row
    @Transactional
    public void deleteStudent(int studentId) {
        Student student = hibernateTemplate.get(Student.class, studentId);
        hibernateTemplate.delete(student);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

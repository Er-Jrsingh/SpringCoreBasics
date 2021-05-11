package com.springcore.dao;

import com.springcore.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Student student) {
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDetailsBean {
    
    private String name;
    private List<String> phones;
    private Set<String> Adresses;

    @Override
    public String toString() {
        return "StudentDetailsBean{" + "name=" + name + ", phones=" + phones + ", Adresses=" + Adresses + ", courses=" + courses + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAdresses() {
        return Adresses;
    }

    public void setAdresses(Set<String> Adresses) {
        this.Adresses = Adresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    private Map<String,String> courses;
    
    
}

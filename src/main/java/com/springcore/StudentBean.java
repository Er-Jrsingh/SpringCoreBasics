package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component                                  // Create Object For  StudentBean & Imlicitly  it gives object's reference name In CamelCase, We Can Give Name Explicitly Like  @Component("anyName")
public class StudentBean {

    @Value("Jitu")                          // Inject this Value In Object
    private String stuName;
    @Value("Thakur")

    private String address;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentBean{" + "stuName=" + stuName + ", address=" + address + '}';
    }
}

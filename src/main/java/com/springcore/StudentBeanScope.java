package com.springcore;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component                                  // Create Object For  StudentBean & Imlicitly  it gives object's reference name In CamelCase, We Can Give Name Explicitly Like  @Component("anyName")
@Scope("prototype")
public class StudentBeanScope {

    @Value("Jitesh Thakur")                          // Inject this Value In Object
    private String stuName;
    @Value("Bilaspur")
    private String address;
    @Value("#{gmail}")                             // Insert Collection,gmail_list comes from stereo_collection_config.xml standalone collection
    private List<String> email;

    @Override
    public String toString() {
        return "StudentBeanCollection{" + "stuName=" + stuName + ", address=" + address + ", email=" + email + '}';
    }

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

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

}

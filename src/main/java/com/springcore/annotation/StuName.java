package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StuName {

    private String name;
    
//    Autowiring By Property uses Setter to initialize
   @Autowired
   @Qualifier("rollObj3")
    private StuRoll rollObj;

    public StuName() {
    }

    public StuName(String name, StuRoll rollObj) {
        super();
        this.name = name;
        this.rollObj = rollObj;
        System.out.println("Constructor Of StuName ");
    }
    
//    Autowiring By Constructor
//   @Autowired
//   @Qualifier("rollObj2") //Not Allowed Here
    public StuName(StuRoll rollObj) {
        
        System.out.println("Set rollObj By Constructor");
        
        this.rollObj = rollObj;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        System.out.println("setName Of StuName ");
        this.name = name;
    }
    
    public StuRoll getRollObj() {
        return rollObj;
    }

//  Autowiring By Setter
//   @Autowired
//   @Qualifier("rollObj2")
    public void setRollObj(StuRoll rollObj) {

        System.out.println("setRollObj Of StuName ");
        this.rollObj = rollObj;
    }

    @Override
    public String toString() {
        return "StuName{" + "name=" + name + ", rollObj=" + rollObj + '}';
    }

}

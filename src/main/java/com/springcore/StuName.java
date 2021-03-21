package com.springcore;

public class StuName {

    private String name;
    private StuRoll rollObj;

    //Called By autowire="constructor"
    public StuName(StuRoll rollObj) {
        
        System.out.println("Set rollObj By Constructor");
        
        this.rollObj = rollObj;
    }

    //Called By autowire="byName"
    public StuName() {
    }
    
    

    public StuName(String name, StuRoll rollObj) {
        super();
        this.name = name;
        this.rollObj = rollObj;
        System.out.println("Constructor Of StuName ");
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

    public void setRollObj(StuRoll rollObj) {

        System.out.println("setRollObj Of StuName ");
        this.rollObj = rollObj;
    }

    @Override
    public String toString() {
        return "StuName{" + "name=" + name + ", rollObj=" + rollObj + '}';
    }

}

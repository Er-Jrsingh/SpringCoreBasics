package com.springcore.objects;

public class StuInfo {

    private String name;
    private StuRoll rollObj;
    

    public StuInfo(String name, StuRoll rollObj) {
        super();
        this.name = name;
        this.rollObj = rollObj;
    }

    @Override
    public String toString() {
        return "StuName{" + "name=" + name + ", rollNo=" + "{"+ this.rollObj.rollNo +"}";
    }

}

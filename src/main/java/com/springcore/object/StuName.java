package com.springcore.object;

public class StuName {

    private String name;
    private StuRoll rollObj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StuRoll getRollObj() {
        return rollObj;
    }

    public void setRollObj(StuRoll rollObj) {
        this.rollObj = rollObj;
    }

    @Override
    public String toString() {
        return "StuName{" + "name=" + name + ", rollObj=" + rollObj + '}';
    }

}

package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customers implements InitializingBean, DisposableBean {

    private String name;

    public Customers() {
        System.out.println("I Am Customers Constructor");
    }

    @Override
    public String toString() {
        return "Customers{" + "name=" + name + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Customers Setter");
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init From Customers");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Desrtoy From Customers");
    }

}

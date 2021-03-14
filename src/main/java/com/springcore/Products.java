package com.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Products {

    private String productName;

    public Products() {

        System.out.println("I Am Products Constructor");
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        System.out.println("Products Setter");
        this.productName = productName;
    }

    @PostConstruct
    public void init() {
        System.out.println("Products init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Products Destroy");
    }

    @Override
    public String toString() {
        return "Products{" + "productName=" + productName + '}';
    }

}

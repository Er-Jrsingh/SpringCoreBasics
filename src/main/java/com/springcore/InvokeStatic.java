package com.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class InvokeStatic {

    @Value("#{T(java.lang.Math).sqrt(2500)}")
    private double sqRoot;

    @Value("#{T(java.lang.Math).E}")
    private double e;

    @Value("#{T(java.lang.Math).PI}")
    private double PI;

    public double getSqRoot() {
        return sqRoot;
    }

    public void setSqRoot(double sqRoot) {
        this.sqRoot = sqRoot;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "InvokeStatic{" +
                "sqRoot=" + sqRoot +
                ", e=" + e +
                ", PI=" + PI +
                '}';
    }
}

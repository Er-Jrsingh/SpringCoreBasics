package com.springcore.ambiguity;

public class DataBean {

    private int num1;
    private int num2;

    public DataBean(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("constructor : int int");
    }
    
    public DataBean(double num1, double num2) {
        this.num1 = (int)num1;
        this.num2 = (int)num2;
        System.out.println("constructor : double double");
    }
    
    public DataBean(String num1, String num2) {
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
        System.out.println("constructor : String String");
    }
    
   public void addition(){
       
       System.out.println("Sum Is :- "+(this.num1+this.num2));
      
    }

}

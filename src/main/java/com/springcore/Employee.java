package com.springcore;

public class Employee {
    
    
    private float salary;
    
    Employee(){
        System.out.println("I Am Constructor");     //Run First
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        System.out.println("Congo! Property Initialized");      //Run Second
        this.salary = salary;
    }
    
    public void init(){                               /* method name init Not Mandatory But Siganture Is Mandatory  */  
        
        System.out.println("Hola! Init");       //Run Third
        
    }
    
    public void destroy(){                             /* method name destroy Not Mandatory But Siganture Is Mandatory  */ 
        
        System.out.println("Oooopss! Destroy");     //Run Last
        
    }
    

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
    
}

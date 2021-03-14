package com.springcore;

public class Employee {
    
    
    private float salary;
    
    Employee(){
        System.out.println("I Am Employee Constructor");     //Run First
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        System.out.println("Employee Setter");      //Run Second
        this.salary = salary;
    }
    
    public void init(){                               /* method name init Not Mandatory But Siganture Is Mandatory  */  
        
        System.out.println("Hola! Employee Init");       //Run Third
        
    }
    
    public void destroy(){                             /* method name destroy Not Mandatory But Siganture Is Mandatory  */ 
        
        System.out.println("Oooopss! Employee Destroy");     //Run Last
        
    }
    

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
    
}

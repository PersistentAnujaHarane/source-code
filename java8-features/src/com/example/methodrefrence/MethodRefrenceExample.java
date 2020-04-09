package com.example.methodrefrence;

//Method reference is used to refer method of functional interface. 
//It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference
/**
 * Types of Method References
There are following types of method references in java:

Reference to a static method.
Reference to an instance method.
Reference to a constructor.**
 * @author harane
 *
 */

interface Sayable{  
    void say();  
}  
public class MethodRefrenceExample {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodRefrenceExample::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  
/**
 *      Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
            //Refrence to constructor
            ClassName::new  
 */


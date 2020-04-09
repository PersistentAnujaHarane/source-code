package com.example.functionalinterface;

//An Interface that contains exactly one abstract method is known as functional interface. 
//It can have any number of default, static methods but can contain only one abstract method. 
//It can also declare methods of object class.
@FunctionalInterface
public interface Sayable {
	void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}
/** Invalid Functional Interface
interface sayable{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Doable extends sayable{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  
**/
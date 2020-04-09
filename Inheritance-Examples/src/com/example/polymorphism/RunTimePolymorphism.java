package com.example.polymorphism;
/**
 *  Method Overriding in Java – This is an example of runtime time (or dynamic polymorphism)
 * 
 * Method overriding is used to provide specific implementation of a method that is already provided by its super class.
   Method overriding is used for runtime polymorphism
   
   Rules for Java Method Overriding
1.method must have same name as in the parent class
2.method must have same parameter as in the parent class.
3.must be IS-A relationship (inheritance).

 * @author harane
 *
 */
 class Animal{
	   public void sound(){
	      System.out.println("Animal is making a sound");   
	   }
	}
class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }
   
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
   
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}
public class RunTimePolymorphism {
	 public static void main(String args[]){
	    	Animal obj = new Horse();
	    	obj.sound();
	    	Animal obj1 = new Dog();
	    	obj1.sound();
	    	Animal obj2 = new Cat();
	    	obj2.sound();
	    }

}

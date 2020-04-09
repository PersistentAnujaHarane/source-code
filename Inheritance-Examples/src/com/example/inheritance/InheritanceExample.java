package com.example.inheritance;
/**
 * Inheritance in java is a mechanism in which the derived/child object acquires the properties and behaviors of parent object.
 * Along with inheriting parent class methods and fields new methods and fields can also be added.
 * Inheritance represents the IS-A relationship, also known as parent-child relationship.
 * Used for 1.For Method Overriding (so runtime polymorphism can be achieved).
            2.For Code Reusability.
 * @author harane
 *
 */
class Animal{  
void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  

public class InheritanceExample {
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
		}
}

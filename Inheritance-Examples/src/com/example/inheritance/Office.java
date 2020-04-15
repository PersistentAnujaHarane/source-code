package com.example.inheritance;

class Employee {
private String name;
String address;
protected String phoneNumber;
public float experience;
}
class Programmer extends Employee {
Programmer (String val) {
name = val;
}
String getName() {
return name;
}
}
class Office {
public static void main(String args[]) {
new Programmer ("Harry").getName();
}
}
/*
 * The class Office prints Harry.
b The derived class Programmer can’t define a getter method for a variable defined
in its base class Employee.
c///The derived class Programmer can’t access variables of its base class in its
constructors.///
d new Programmer ("Harry").getName(); isn’t the right way to create an object
of class Programmer.
e Compilation error.*/

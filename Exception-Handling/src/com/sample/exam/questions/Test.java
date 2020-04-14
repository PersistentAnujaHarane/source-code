package com.sample.exam.questions;


class Test {
public static void main(String args[]) {
Course c = new Course();
c.courseName = "Java";
System.out.println(c.courseName);
}
}
class Course {
String courseName;
Course() {
Course c = new Course();
c.courseName = "Oracle";
}
}
/**
a The code will print Java.
b The code will print Oracle.
c The code will not compile.
d The code will throw an exception or an error at runtime.*/
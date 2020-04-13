package com.example.exception;
/**
 * If both the catch and finally blocks define return statements, the calling method
will receive a value from the finally block.
 * @author harane
 *
 */
public class MultipleReturn {
int getInt() {
try {
String[] students = {"anuja", "nikita"};
System.out.println(students[5]);
} catch (Exception e) {
return 10;
} finally {
return 20;
}
}
public static void main(String args[]) {
MultipleReturn var = new MultipleReturn();
System.out.println(var.getInt());
}
}

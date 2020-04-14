package com.sample.exam.questions;

class Test1 {
public static void main(String args[]) {
Test1 var = new Test1();
var.printArrValues(args);
}
void printArrValues(String[] arr) {
try {
System.out.println(arr[0] + ":" + arr[1]);
} catch (NullPointerException e) {
System.out.println("NullPointerException");
} catch (IndexOutOfBoundsException e) {
System.out.println("IndexOutOfBoundsException");
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException");
}
}
}
/**
 * If the class EJavaGuruExcep is executed using the following command, it prints
NullPointerException:
java EJavaGuruExcep
b If the class EJavaGuruExcep is executed using the following command, it prints
IndexOutOfBoundsException:
java EJavaGuruExcep
c If the class EJavaGuruExcep is executed using the following command, it prints
ArrayIndexOutOfBoundsException:
java EJavaGuruExcep one
d The code will fail to compile.*/
 */


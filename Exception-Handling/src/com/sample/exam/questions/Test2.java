package com.sample.exam.questions;

public class Test2 {
	
		void method() {
		try {
		guru();
		return;
		} finally {
		System.out.println("finally 1");
		}
		}
		void guru() {
		System.out.println("guru");
		throw new StackOverflowError();
		}
		public static void main(String args[]) {
		Test2 var = new Test2();
		var.method();
		}
		}

/**
 * a guru
finally 1
b guru
finally 1
Exception in thread "main" java.lang.StackOverflowError
c guru
Exception in thread "main" java.lang.StackOverflowError
d guru
e The code fails to compile.*/

package com.example.exception;

public class StackOverflowErrorExample {
	static void recursion() {
		recursion();
		}
		public static void main(String args[]) {
		recursion();
		}

}

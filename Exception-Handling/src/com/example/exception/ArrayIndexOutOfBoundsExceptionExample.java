package com.example.exception;

import java.util.ArrayList;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String[] season = {"Spring", "Summer"};
		ArrayList<String> exams = new ArrayList<>();
		exams.add("SCJP");
		exams.add("SCWCD");
		/**
		System.out.println(season[5]);  //ArrayIndexOutOfBoundsException
		System.out.println(season[-9]); **/
		
		System.out.println(exams.get(-1));  //IndexOutOfBoundsException
		System.out.println(exams.get(4));
		
		/**
		 * When you try to access an invalid array position, ArrayIndexOutOf-
BoundsException is thrown. When you try to access an invalid ArrayList
position, IndexOutOfBoundsException is thrown.*/
		 
	}

}

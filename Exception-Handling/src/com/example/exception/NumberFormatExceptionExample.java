package com.example.exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.parseInt("+123"));
		//System.out.println(Integer.parseInt("123_45")); 
		//Will throw NumberFormatException.Use of underscores in string values isn’t allowed.
		//System.out.println(Integer.parseInt("12ABCD"));
		//Will throw NumberFormatException.Characters ABCD can’t be converted to integers in base 10.
	}

}

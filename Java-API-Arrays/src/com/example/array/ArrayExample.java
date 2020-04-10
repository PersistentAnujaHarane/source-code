package com.example.array;

public class ArrayExample {
	public static void main(String[] args) {
		
		int intArray[]; //array declaration 
		intArray = new int[2]; //array allocation
		//array initializes using for loop
		for (int i=0; i<intArray.length; i++) {
		intArray[i] = i + 5;
		}
		//reinitialize specific elements
		intArray[0] = 10;
		intArray[1] = 1870;
		
		//multidimensional array
		int[] multiArr[];
		multiArr = new int[2][3];
		for (int i=0; i<multiArr.length; i++) {
		for (int j=0; j<multiArr[i].length; j++) {
		multiArr[i][j] = i + j;
		}
		}
		multiArr[0][0] = 10;
		multiArr[1][2] = 1210;
		multiArr[0][1] = 110;
		multiArr[0][2] = 1087;
		
		
		/**Code to access an array index will throw a runtime exception if
		you pass it an invalid array index value. Code to access an array index will fail
		to compile if you don’t use a char, byte, short, or int.**/
		
		//When you combine an array declaration, allocation, and initialization
		//in a single step, you can’t specify the size of the array. The size of the
		//array is calculated by the number of values that are assigned to the array.
	}

}

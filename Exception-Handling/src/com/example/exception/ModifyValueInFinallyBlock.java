
package com.example.exception;

public class ModifyValueInFinallyBlock {
	int getInt() {
		int returnVal = 10;
		try {
		String[] students = {"anizhe", "anuja"};
		System.out.println(students[10]);
		} catch (Exception e) {
		System.out.println("About to return :" + returnVal);
		return returnVal;
		} finally {
		returnVal += 10;
		System.out.println("Return value is now :" + returnVal);
		}
		return returnVal;
		}
		public static void main(String args[]) {
		ModifyValueInFinallyBlock var = new ModifyValueInFinallyBlock();
		System.out.println("In Main:" + var.getInt());
		}
}
/**
Even though the finally block adds 10 to the variable returnVal, this modified value
is not returned to the method main. Control in the catch block copies the value of
returnVal to be returned before it executes the finally block, so the returned value
is not modified when finally executes.*/
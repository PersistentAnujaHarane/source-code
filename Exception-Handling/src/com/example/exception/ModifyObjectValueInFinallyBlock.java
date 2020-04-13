package com.example.exception;

public class ModifyObjectValueInFinallyBlock {
	StringBuilder getStringBuilder() {
		StringBuilder returnVal = new StringBuilder("10");
		try {
		String[] students = {"Harry", "Paul"};
		System.out.println(students[5]);
		} catch (Exception e) {
		System.out.println("About to return :" + returnVal);
		return returnVal;
		} finally {
		returnVal.append("10");
		System.out.println("Return value is now :" + returnVal);
		}
		return returnVal;
		}
		public static void main(String args[]) {
		ModifyObjectValueInFinallyBlock var = new ModifyObjectValueInFinallyBlock();
		System.out.println("In Main:" + var.getStringBuilder());
		}
		}


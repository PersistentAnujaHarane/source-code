package com.example.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * The return statement does not return the control to the main method
before execution of the finally block completes

The finally block executes even if an exception handler defines a return
statement.
 * @author harane
 *
 */
public class ReturnFromCatchBlock {
	
	public static void main(String args[]) {
	openFile();
	}
	private static void openFile() {
	FileInputStream fis = null;
	try {
	fis = new FileInputStream("file.txt");
	}
	catch (FileNotFoundException fnfe) {
	System.out.println("file not found");
	return;
	}
	finally {
	System.out.println("finally");
	}
	System.out.println("Next task..");
	}
	}


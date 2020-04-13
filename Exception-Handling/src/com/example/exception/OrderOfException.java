package com.example.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrderOfException {
	public static void main(String args[]) {
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("file.txt");
		fis.close();
		}
		catch ( FileNotFoundException fnfe) {
		System.out.println("IOException");
		}
		catch ( IOException ioe) {
		System.out.println("file not found");
		}
		}
}

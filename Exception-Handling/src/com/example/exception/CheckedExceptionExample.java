package com.example.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Checked exceptions—java.lang.Exception and its subclasses )
   Runtime exceptions—java.lang.RuntimeException and its subclasses
   Errors—java.lang.Error and its subclasses
 * @author anuja harane
 *
 */
 class CheckedExceptionExample {
	 public static void main(String[] args) 
	 {
	     try
	     {
	         FileReader file = new FileReader("somefile.txt");
	     } 
	     catch (FileNotFoundException e) 
	     {
	         //Alternate logic
	    	 System.out.println(e);
	        // e.printStackTrace();
	     }
	 }

}

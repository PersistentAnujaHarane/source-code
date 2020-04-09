package com.example.functionalinterface;

public interface Doable {
	 
	    default void doIt(){  
	        System.out.println("Do it now");  
	    }  
	}  



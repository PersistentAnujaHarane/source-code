package com.example.functionalinterface;

public class DoableImpl implements Sayable1 {

	 public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	        DoableImpl fie = new DoableImpl();  
	        fie.say("Hello there");  
	        fie.doIt();  
	    }  

}

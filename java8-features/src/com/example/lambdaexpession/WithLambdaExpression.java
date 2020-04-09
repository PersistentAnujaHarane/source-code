package com.example.lambdaexpession;

// (argument-list) -> {body}  

@FunctionalInterface  //It is optional  
interface Drawable1{  
    public void draw();  
}  
  
public class WithLambdaExpression {
	 public static void main(String[] args) {  
	        int width=10;  
	          
	        //with lambda  
	        Drawable1 d2=()->{  
	            System.out.println("Drawing "+width);  
	        };  
	        d2.draw();  
	    } 
}

package com.example.functionalinterface;

public class SayableImpl implements Sayable {

	public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        SayableImpl fie = new SayableImpl();  
        fie.say("Hello there");  
    }  

}

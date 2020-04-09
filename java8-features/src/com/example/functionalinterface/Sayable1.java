package com.example.functionalinterface;

@FunctionalInterface  
interface Sayable1 extends Doable{  
    void say(String msg);   // abstract method  
}  
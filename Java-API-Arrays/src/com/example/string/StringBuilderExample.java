package com.example.string;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		System.out.println("..............append()...........");
		StringBuilder sb1 = new StringBuilder();
		sb1.append(true);
		sb1.append(10);
		sb1.append('a');
		sb1.append(20.99);
		sb1.append("Hi");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Java");
		sb2.append(new Person("Oracle"));
		System.out.println(sb2);
		
		System.out.println("...............insert()..............");
		StringBuilder sb3 = new StringBuilder("Bon");
		sb3.insert(2, 'r');
		System.out.println(sb3);
		
		
		System.out.println("................delete() and deleteAt().............");
		StringBuilder sb4 = new StringBuilder("0123456");
		sb4.delete(2, 4);  //Removes characters at positions starting from 2 to 4,excluding 4
		System.out.println(sb4);
		
		sb4.deleteCharAt(2);
		System.out.println(sb4);
		
		System.out.println("...............reverse().............");
		sb1.reverse();
		//You can’t use the method reverse to reverse a substring of StringBuilder.
		System.out.println(sb1);
		
		System.out.println("..................replace()..........");
		//method replace in String accepts the characters to be replaced. The method replace in
		//StringBuilder accepts a position to be replaced.
		StringBuilder sb5 = new StringBuilder("0123456");
		sb5.replace(2, 4, "ABCD");
		System.out.println(sb5);
		
		System.out.println("...............subSequence().............");
		
		StringBuilder sb6 = new StringBuilder("0123456");
		System.out.println(sb6.subSequence(2, 4));
		System.out.println(sb6);
	}
}
	class Person {
		String name;
		Person(String str) { name = str; }
		}



package com.example.exception;


	class Ink1{}
	interface Printable {}
	class ColorInk1 extends Ink1 implements Printable {}
	class BlackInk1 extends Ink1{}
	class Test1 {
	public static void main(String args[]) {
	Printable printable = null;
	BlackInk1 blackInk = new BlackInk1();
	printable = (Printable)blackInk;
	}
	}


package com.example.exception;

import java.util.ArrayList;

public class ClassCastExceptionExample {
	public static void main(String args[]) {
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new ColorInk());
		inks.add(new BlackInk());
		Ink ink = (BlackInk)inks.get(0);
		}
		}
		class Ink{}
		class ColorInk extends Ink{}
		class BlackInk extends Ink{}



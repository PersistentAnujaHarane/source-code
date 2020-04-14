package com.example.exception;

import java.util.ArrayList;

public class NullPointerExceptionExample {
	static ArrayList<String> list = null;
	public static void main(String[] args) {
	list.add("1");
	}

}

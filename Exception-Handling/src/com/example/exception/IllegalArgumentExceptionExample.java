package com.example.exception;

public class IllegalArgumentExceptionExample {
	public void login(String username, String pwd, int maxLoginAttempt) {
		if (username == null || username.length() < 6)
		throw new IllegalArgumentException
		("Login:username can’t be shorter than 6 chars");
		if (pwd == null || pwd.length() < 8)
		throw new IllegalArgumentException
		("Login: pwd cannot be shorter than 8 chars");
		if (maxLoginAttempt < 0)
		throw new IllegalArgumentException
		("Login: Invalid loginattempt val");
	}
	public static void main(String[] args) {
		IllegalArgumentExceptionExample argumentExceptionExample=new IllegalArgumentExceptionExample();
		argumentExceptionExample.login("anujaa", "haaadd", 1);
	}

}

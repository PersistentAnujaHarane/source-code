package com.example.staticmethod;

public interface MyData {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
/**
 * Java interface static method is part of interface, we can’t use it for implementation class objects.
Java interface static methods are good for providing utility methods, for example null check, collection sorting etc.
Java interface static method helps us in providing security by not allowing implementation classes to override them.
We can’t define interface static method for Object class methods, we will get compiler error as “This static method cannot hide the instance method from Object”. This is because it’s not allowed in java, since Object is the base class for all the classes and we can’t have one class level static method and another instance method with same signature.
We can use java interface static methods to remove utility classes such as Collections and move all of it’s static methods to the corresponding interface, that would be easy to find and use.**/

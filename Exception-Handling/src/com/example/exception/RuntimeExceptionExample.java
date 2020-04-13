package com.example.exception;

import java.io.FileNotFoundException;

public class RuntimeExceptionExample {
	
		void method1() throws Error {}
		void method2() throws Exception {}
		void method3() throws Throwable {}
		void method4() throws RuntimeException {}
		void method5() throws FileNotFoundException {}
		class HandleExceptions {
			void method6() {
			try {}
			catch (Error e) {}
			}
			void method7() {
			try {}
			catch (Exception e) {}
			}
			void method8() {
			try {}
			catch (Throwable e) {}
			}
			void method9() {
			try {}
			catch (RuntimeException e) {}
			}
		/**
		 * A method can declare to throw any type of exception, checked or
unchecked, even if it doesn’t do so. But a try block can’t define a catch
block for a checked exception (other than Exception) if the try block
doesn’t throw that checked exception or use a method that declares to throw
that checked exception.
		 
			void method10() {
			try {}
			catch (FileNotFoundException e) {}
			}*/
			}
		
}

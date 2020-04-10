package com.example.string;

public class StringExample {
	public static void main(String[] args) {
         //The code creates a new String object with the value "Summer". 
		//This object is not placed in the String constant pool.
		
			String summer = new String("Summer");
			
        //The code creates a new String object with the value "Summer" 
			//and places it in the String constant pool.
			
			String summer2 = "Summer";
			
			//The code at doesn’t need to create any new String object. It reuses the
			//String object with the value "Summer" that already existed in the String constant
			//pool.
			
			System.out.println("Summer");
			
			//The code  creates a new String object with the value "autumn" and places
			//it in the String constant pool.
			
			System.out.println("autumn");
			
			//The code reuses the String value "autumn" from the String constant
			//pool. It creates a String object with the value "summer" in the String constant
			//pool (note the difference in the case of letters—Java is case-sensitive and
			//"Summer" is not the same as "summer").
			System.out.println("autumn" == "summer");
			
			//The code creates a new String object with the value "Summer".
			String autumn = new String("Summer");
			
			System.out.println(".............charAt().................");
			//The above code creates a total of five String objects.
			
			String name = new String("Paul");
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(2));
			
			//below code will throw an exception at runtime:
				//System.out.println(name.charAt(4));
			System.out.println(".............indexOf().................");
			String letters = "ABCAB";
			System.out.println(letters.indexOf('B'));
			System.out.println(letters.indexOf("S"));
			System.out.println(letters.indexOf("CA"));
			
			//By default, the indexOf() method starts its search from the first char of the target
			//String. If you wish, you can also set the starting position
			System.out.println(letters.indexOf('B', 2));
			
			System.out.println(".............substring().................");
			//substring method doesn’t include the character at the end position
			String exam = "Oracle";
			String result = exam.substring(2, 4);
			System.out.println(result);
			
			System.out.println(".............trim().................");
			String varWithSpaces = " AB CB ";
			System.out.print(":");
			System.out.print(varWithSpaces);
			System.out.print(":");
			
			System.out.print(":");
			System.out.print(varWithSpaces.trim());
			System.out.print(":");
			
			System.out.println(".............replace().................");
			System.out.println(letters.replace('B', 'b'));
			System.out.println(letters.replace("CA", "12"));
			/**
			System.out.println(letters.replace('B', "b"));
			System.out.println(letters.replace("B", 'b'));**/
			
			System.out.println(".............length().................");
			System.out.println("Shreya".length());
			
			System.out.println(letters.startsWith("AB"));
			System.out.println(letters.startsWith("a"));
			System.out.println(letters.startsWith("A", 3));
			
			
			System.out.println(".............cancat using +.................");
			int num = 10;
			int val = 12;
			String aStr = "OCJA";
			String anotherStr = num + val + aStr;
			System.out.println(anotherStr);
			
			anotherStr = "" + num + val + aStr;
			System.out.println(anotherStr);
			
			String lang = "Java";
			lang += " is everywhere!";
			String initializedToNull = null;
			initializedToNull += "Java";
			System.out.println(initializedToNull);
			
			System.out.println(".............== and equals().................");
			String var1 = new String("Java");
			String var2 = new String("Java");
			System.out.println(var1.equals(var2));
			System.out.println(var1 == var2);
			System.out.println(var1 != var2);
			
			String var3 = "code";
			String var4 = "code";
			System.out.println(var3.equals(var4));
			System.out.println(var3 == var4);
			System.out.println(var3 != var4);
			
			String lang1 = "Java";
			String lang2 = "JaScala";
			String returnValue1 = lang1.substring(0,1);
			String returnValue2 = lang2.substring(0,1);
			System.out.println(returnValue1 == returnValue2);
			System.out.println(returnValue1.equals(returnValue2));

			}
		

}

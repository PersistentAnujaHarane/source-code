package com.example.stringjoiner;

import java.util.StringJoiner;
/**
 * It is used to construct a sequence of characters separated by a delimiter. 
 * Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. 
 * You can also pass prefix and suffix to the char sequence.
 * @author harane
 *
 */
public class StringJoinerExample {
	public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
          
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
        StringJoiner joinNames1 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNames1.add("Rahul");  
        joinNames1.add("Raju");  
        joinNames1.add("Peter");  
        joinNames1.add("Raheem");  
                  
        System.out.println(joinNames1); 
        
        StringJoiner merge = joinNames.merge(joinNames1);   
        System.out.println(merge);  
    }  
}
/**
 add(CharSequence newElement)-------	It adds a copy of the given CharSequence value as the next element of the StringJoiner value. If newElement is null,"null" is added.
merge(StringJoiner other)-----	It adds the contents of the given StringJoiner without prefix and suffix as the next element if it is non-empty. If the given StringJoiner is empty, the call has no effect.
 length() ------It returns the length of the String representation of this StringJoiner.
setEmptyValue(CharSequence emptyValue)----It sets the sequence of characters to be used when determining the string representation of this StringJoiner and no elements have been added yet, that is, when it is empty.
**/
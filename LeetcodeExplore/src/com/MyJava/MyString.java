package com.MyJava;

public class MyString {

	public static void main(String[] args) {
		/* String s = "GeeksforGeeks";
		 * s.length();  // 13   find string length
		 * s.charAt(3); // k    find char at a index
		 * s.substring(3); // ksforGeeks   substring of a string
		 * s.substring(3,5); // ks         substring of a string
		 * 
		 * String s1 = "Murali";
		 * String s2 = "dhar";
		 * s1.concat(s2); // Muralidhar         append a string to another string
		 * 
		 * String s4 = "Learn Share Learn";
         * System.out.println("Index of Share " + s4.indexOf("Share")); //6  index of a substring in a string
		 * 
		 * String s1 = "Murali";
		 * String s2 = "Murali";
		 * String s3 = "murali";
		 * s1.equals(s2); // true  equals method
		 * s1.equalsIgnoreCase(s3); // true
		 * 
		 * String s1 = "murali";
		 * s1.toUpperCase(); // MURALI
		 * String s2 = "MURALI";
		 * s2.toLowerCase(); // murali
		 * 
		 * String s2 = " Hi There Hello ";
		 * s2.trim(); //"Hi There Hello";
		 * 
		 * String s3 = "HHHHHHH";
		 * s3.replace{'H' , 'G'); // "GGGGGGG"
		 */
		
		
		//stringMethods();	
		stringMethodsLeetcode();
	}

	private static void stringMethodsLeetcode() {
		// initialize
        String s1 = "Hello World";
        System.out.println("s1 is \"" + s1 + "\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1.");
        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
 
		
	}

	private static void stringMethods() {
		String s= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");
  
        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
  
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                           + s.charAt(3));
  
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));
  
        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(3,5));
  
        // Concatenates string2 to the end of string1.
        String s1 = "Murali";
        String s2 = "dhar";
        System.out.println("Concatenated string  = " + s1.concat(s2));
  
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));
  
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + 
                           s4.indexOf('a',3));
  
        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);
  
        out = "Geeks".equalsIgnoreCase("gEeks");
        System.out.println("Checking Equality " + out);
          
        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case " +
                            word1.toLowerCase());
  
        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case " + 
                            word2.toUpperCase());
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
  
        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);
		
	}

}

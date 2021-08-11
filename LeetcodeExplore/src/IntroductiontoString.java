public class IntroductiontoString {

	public static void main(String[] args) {
		
		// Initialize a String
		String s1 = "Hello World";
		
		System.out.println(s1.length());
		
		// Creating another reference s2 for s1
		String s2 = s1;
		
		System.out.println("s2 is another reference to s1.");
		
		// Creating a new String 
		String s3 = new String(s1);
		System.out.println(s3);
		System.out.println(s3.hashCode());
		
		// String compare using '=='
		System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
		System.out.println("s1 and s2: " + (s1 == s2));
		System.out.println("s1 and s3: " + (s1 == s3));
		
		// String compare using 'equals'
		System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        
        // String compare using 'compareTo'
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
		
        // String Concatenation
        s1 = s1 + "!";
        System.out.println(s1);
        System.out.println(s2);	
		
        // Find a character in String
        System.out.println("The position of first 'o' is: " + s1.indexOf('o'));
        System.out.println("The position of last 'o' is: " + s1.lastIndexOf('o'));
        
        // Get a substring
        System.out.println(s1.substring(7,11));
        
        // Immutable String Problems
        // String Concatenation is very slow in Java
        // Create a new String every time and copy the elements
        String s = "";
        int n = 1000;
        for(int i = 0; i < n; i++) {
        	s =  s + "hello";
        }
        
        // If you did want your string to be mutable, you can convert it to a char array.
        
        String s4 = "Hello World";
        char[] str5 = new char[20];
        str5 = s4.toCharArray();
        System.out.println(str5);
        char[] str = s4.toCharArray();
        System.out.println(str.length);
        System.out.println(s4.length());
        
        for(int i = 0; i < str.length; i++) {
        	System.out.print(i);
        	System.out.println(str[i]);
        }
        str[5] = ',';
        System.out.println(str);
        
        // 2. If you have to concatenate strings often, it will be better to use some other data structures 
        //like StringBuilder. The below code runs in O(n) complexity.
        int n1 = 5000;
        StringBuilder str1 = new StringBuilder();
        for(int j = 0; j < n1; j++) {
        	str1.append("hello ");
        }
        
        String s5 = str1.toString();
        System.out.println(s5);
        System.out.println("End");
        
        int l = 'A' - 'B';
        System.out.println(l);
        
	}
}

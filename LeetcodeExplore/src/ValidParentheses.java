import java.util.*;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		String s = "{()[]{}}";
		
		System.out.println(isValid(s)); // Solution 1
		
		System.out.println(isValid2(s)); // Solution 2

	}

	public static boolean isValid(String s) {
		Map<Character, Character> mapping = new HashMap<Character, Character>();
		mapping.put(')', '(');
		mapping.put(']', '[');
		mapping.put('}', '{');
		mapping.put('{', ' ');
		mapping.put('[', ' ');
		mapping.put('(', ' ');
		
        boolean result = false;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	
        	Character temp = mapping.get(s.charAt(i));
        	
        	if(stack.isEmpty()) {
        		stack.push(s.charAt(i));
        	}else if(temp.equals(stack.peek())) {
        		stack.pop();
        		
        	}else {
        		stack.push(s.charAt(i));
        	}
        }
        
        if(stack.isEmpty()) {
        	result = true;
        }
        return result;
		
    }
	
	public static boolean isValid2(String s) {
		
        boolean result = true;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	
        	char c = s.charAt(i);
        	
        	if(c == '(') {
        		stack.push(')');			
        	}else if(c == '[') {
        		stack.push(']');			
        	}else if(c == '{') {
        		stack.push('}');			
        	}else if(stack.isEmpty() || stack.pop() != c) {
        		return false;
        	}
        }
        return result;
        
		
    }
}

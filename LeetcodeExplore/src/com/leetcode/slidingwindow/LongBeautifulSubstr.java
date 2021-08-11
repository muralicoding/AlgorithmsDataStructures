package com.leetcode.slidingwindow;

import java.util.Stack;

public class LongBeautifulSubstr {

	public static void main(String[] args) {
		//String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
		String word = "iiiiiiiiiiiiiiiiaeiou";
		//             012345678901234567890
		System.out.println(helper(word));

	}
	
	public static int helper(String word) {
		
		int answer = 0;
		
		int i = 0;
		int j = 0;
		int size = word.length();
		
		char prev = ' ';
		
		Stack<Character> st = aeiou();
		
		while(j < size && word.charAt(j) != 'a') {
			j++;
		}i = j;
		
		
		
		while(j < size) {
			char ch = word.charAt(j);
			
			
			if((!st.isEmpty() && st.peek() == ch) || ch == prev ) {
				if(!st.isEmpty() && st.peek() == ch) {
					st.pop();
					prev = ch;
				}
				
				if(st.size() > 0) {
					j++;
				}else if(st.size() == 0) {
					answer = Math.max(answer, j - i + 1);
					j++;
				}
				
			}else {
				while(j < size && word.charAt(j) != 'a') {
					j++;
				}i = j;
				
				st = aeiou();
				prev = ' ';
			}
		}
		return answer;
	}
	
	public static Stack<Character> aeiou() {
		Stack<Character> stack = new Stack<Character>();
		stack.clear();
		stack.push('u');
		stack.push('o');
		stack.push('i');
		stack.push('e');
		stack.push('a');
		return stack;
	}
}

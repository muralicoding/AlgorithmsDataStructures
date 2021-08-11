package com.leetcode.slidingwindow;

import java.util.*;

public class longestBeautifulSubstring {
	
	

	public static void main(String[] args) {
		String word = "aaeeiaaioaaaaeiiiiouuuooaauuaeiu";
        //String word = "aeeeiiiioooauuuaeiou";
		System.out.println(helper(word));

	}
	
	public static int helper(String word) {
				
		int answer = 0;
		
		
		
		int i = 0;
		int j = 0;
		int size = word.length();
		char prev = ' ';
		
		Stack<Character> st = aeiou();

		while(j < size) {
			//conditions
			//String word = "aeeeiiiioooauuuaeiou";
			//               0123456789012345
			char ch = word.charAt(j);
			System.out.println(j + " " + ch + " " + "!!!!!!!!!!!!!!!!!");
			if(!st.isEmpty() && st.peek() == ch) {
				prev = ch;
				st.pop();
				j++;
			}else if(prev == ch) {
				j++;
			}
			else {
				System.out.println("index" + j + " " + ch + " " + "!!!!!!!!!!!!!!!!!");
				st = aeiou();
				while(j < size && st.peek() != ch) {
					
					ch = word.charAt(++j);
					
				}
				
				i = j;
			}
			System.out.println(st.size() + " ***********");
			if(st.size() == 0) {
				answer = Math.max(answer, j - i + 1);
				System.out.println("answer :" + answer);
			}
			
			System.out.println("*****************************");
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

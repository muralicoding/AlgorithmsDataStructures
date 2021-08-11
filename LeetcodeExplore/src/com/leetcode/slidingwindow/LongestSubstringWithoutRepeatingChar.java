package com.leetcode.slidingwindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(helper(s));

	}
	
	public static int helper(String s) {
		int answer = 0;
		int size = s.length();
		int i = 0;
		int j = 0;
		
		HashMap<Character, Integer> mapping = new HashMap<Character, Integer>();
		
		while(j < size) {
			//conditions
			char temp  = s.charAt(j);
			if(mapping.containsKey(temp)) {
				mapping.put(temp, mapping.get(temp) + 1);
			}else {
				mapping.put(temp, 1);
			}
			
			int cond = mapping.size();
			if( cond > j - i + 1) {
				j++;
				
			}else if(cond == j - i + 1) {
				answer = Math.max(answer, j - i + 1);
				j++;
			}else if(cond < j - i + 1) {
				while(mapping.size() < j - i + 1) { //3 < 4
					char ch = s.charAt(i);
					mapping.put(ch, mapping.get(ch) - 1);
					if(mapping.get(ch) == 0) {
						mapping.remove(ch);
					}
					i++;
				}
				j++;
			}	
		}
		
		
		return answer;
		
		
		
		
	}

}

package com.leetcode.slidingwindow;

import java.util.*;

public class LongestSubstringWithKUniqueChar {

	public static void main(String[] args) {
		String s = "aaaa";
		int K = 1;
		System.out.println(helper(s, K));
	}
	
	public static int helper(String s, int K) {
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
			if( cond < K) {
				j++;
				
			}else if(cond == K) {
				answer = Math.max(answer, j - i + 1);
				j++;
			}else if(cond > K) {
				while(mapping.size() > K) {
					char c = s.charAt(i);
					mapping.put(c, mapping.get(c) - 1);
					if(mapping.get(c) == 0) {
						mapping.remove(c);
					}
					i++;
				}
				j++;
			}	
		}
		
		
		return answer;
		
		
		
		
	}

}

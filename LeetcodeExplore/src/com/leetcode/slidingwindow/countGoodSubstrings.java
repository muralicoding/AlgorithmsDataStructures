package com.leetcode.slidingwindow;

import java.util.*;

public class countGoodSubstrings {

	public static void main(String[] args) {
		String s = "xyzzaz";
		System.out.println(helper(s));
	}
	
	public static int helper(String s) {
		int answer = 0;
		
		int i = 0;
		int j = 0;
		int K = 3;
		int size = s.length();
		int cond = 0;
		HashMap<Character, Integer> mapping = new HashMap<Character, Integer>();
		while(j < size) {
			//conditions
			char temp = s.charAt(j);
			if(mapping.containsKey(temp)) {
				mapping.put(temp, mapping.get(temp) + 1);
			}else {
				mapping.put(temp, 1);
			} 
			cond = mapping.size();
			
			if(j - i + 1 < K) {
				j++;
			}else if(j - i + 1 == K) {
				if(cond == K) {
					answer++;
				}
				char ch = s.charAt(i);
				mapping.put(ch, mapping.get(ch) - 1);
				if(mapping.get(ch) == 0) {
					mapping.remove(ch);
				}
				i++;
				j++;
			}
		}
		return answer;
	}
}

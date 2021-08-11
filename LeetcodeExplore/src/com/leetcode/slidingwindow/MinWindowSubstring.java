package com.leetcode.slidingwindow;

import java.util.*;

public class MinWindowSubstring {

	public static void main(String[] args) {
		String s = "A";
		String t = "AA";
		
		System.out.println(helper(s, t));

	}
	
	public static int helper(String s, String t) {
		
		HashMap<Character, Integer> mapping = new HashMap<>();
		int count = 0;
		
		for(int a = 0; a < t.length(); a++) {
			char temp = t.charAt(a);
			if(mapping.containsKey(temp)) {
				mapping.put(temp, mapping.get(temp) + 1);
			}else {
				mapping.put(temp, 1);
				count++;
			}
		}
		
		int answer = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		int size = s.length();
		
		while(j < size) {
			
			System.out.println("sta index : " + i + " char :" + s.charAt(i));
			System.out.println("end index : " + j + " char :" + s.charAt(j));
			char ch = s.charAt(j);

			if(mapping.containsKey(ch)) {
				System.out.println("Here");
				mapping.put(ch, mapping.get(ch) - 1);
				if(mapping.get(ch) == 0) {
					count--;
				}
			}
			
			System.out.println(mapping);
			System.out.println(count);
			
			if(count == 0) {
				
				while(count == 0) {
					System.out.println("st  index : " + i + " char :" + s.charAt(i));
					System.out.println("end index : " + j + " char :" + s.charAt(j));
					
					
					answer = Math.min(answer, j - i + 1);
					
					char tmp = s.charAt(i);
					
					if(mapping.containsKey(tmp)) {
						mapping.put(tmp, mapping.get(tmp) + 1);
						if(mapping.get(tmp) > 0) {
							
							count++;
						}
					}
					
					i++;
				
					System.out.println(" Incrementing I I I");
					
				}
				j++;
				
			}else if(count > 0) {
				j++;
				System.out.println(" Incrementing J J J");
			}
						
		}
		return answer;
		
	}

}

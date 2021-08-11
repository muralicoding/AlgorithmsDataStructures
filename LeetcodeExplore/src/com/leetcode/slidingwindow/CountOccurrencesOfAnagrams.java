package com.leetcode.slidingwindow;

import java.util.*;

public class CountOccurrencesOfAnagrams {

	public static void main(String[] args) {
		String str = "abab";
		String pat = "ab";
		System.out.println(" answer == " + helper(str, pat));

	}
	
public static int helper(String str, String pat) {
		
		HashMap<Character, Integer> mapping = new HashMap<Character, Integer>();
		
		for(char c : pat.toCharArray()) {
			if(mapping.containsKey(c)) {
				mapping.put(c, mapping.get(c) + 1);
			}else {
				mapping.put(c, 1);
			}
		}
		
		System.out.println(mapping);
		
		
		int size = str.length();
		int K = pat.length();
		
		int i = 0;
		int j = 0;
		
		int answer = 0;
		
		
		
		
		
		while(j < size) {
			System.out.println(j);
			// Calculations
			boolean empty = true;
			char temp = str.charAt(j);
			
			if(mapping.containsKey(temp)) {
				mapping.put(temp, mapping.get(temp) - 1);
			}
			
					
			if(j - i + 1 < K) {
				j++;
			}else if(j - i + 1 == K) {
				System.out.println("window is 3" + mapping);
				for(char c: mapping.keySet()) {
					if (mapping.get(c) != 0) {
						empty = false;
					}
				}
				if(empty)answer++;
				char start = str.charAt(i);
				if(mapping.containsKey(start)) {
					mapping.put(start, mapping.get(start) + 1);
				}
				
				
	
				i++; 
				j++;
			}
			
		}
		return answer;
	}
}



/* 
 * public static Map<Character, Integer> createSearchMap(String search){
	Map<Character, Integer> charCount = new HashMap();
	int searchLength = search.length();
	for(int index=0; index< searchLength; index++) {
			if(charCount.get(search.charAt(index)) == null) {
				charCount.put(search.charAt(index), 1);
			}
			else{
				charCount.put(search.charAt(index), charCount.get(search.charAt(index))+1);
			}
	}
	return charCount;
}

public static int slideWindowFindAnagrams(String input, String search){
	Map<Character, Integer> charCount = createSearchMap(search);
	int start=0, offset=0, windowSize = search.length();
	int result=0;
	int keycount = charCount.keySet().size();
	while(offset < input.length()){
			//start of calculations
			char tempChar = input.charAt(offset);
			//decrease the character count if present in map
			if(charCount.containsKey(tempChar)) {
				charCount.put(tempChar, charCount.get(tempChar)-1);
			}

			if(charCount.get(tempChar) == 0){
				keycount--;
			}
			//end of calculations
			
			int end = offset-start+1;
			
			if(end < windowSize) {
				offset++;
			}
			else if(end == windowSize) {
				//calculate result
				if(keycount == 0){
					result++;
				}	
				
				//handle case for first character of the window
				if(charCount.containsKey(input.charAt(start))){
					charCount.put(input.charAt(start), charCount.get(input.charAt(start))+1);
					if(keycount == 0){
						keycount++;
					}
				}
				//slide window
				start++;
				offset++;
			}
	}
	return result;
}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
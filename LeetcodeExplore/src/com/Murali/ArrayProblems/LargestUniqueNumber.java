package com.Murali.ArrayProblems;

import java.util.*;

public class LargestUniqueNumber {

	public static void main(String[] args) {
		int [] input = {5, 7, 3, 9, 4, 9, 8,8,7, 3, 1};
		
		int output = helper(input);
		System.out.println(output);
	}
	
	public static int helper(int[] input) {
		
		
		Map<Integer, Integer> mapping = new HashMap<>();
		
		for(int n: input) {
			if(mapping.containsKey(n)) {
				mapping.remove(n);
			}else {
				mapping.put(n, 1);
			}
		}
		
		int ans = -1;
		
		for(Integer key: mapping.keySet()) {
			if(key > ans) {
				ans = key;
			}
		}
		
		Integer temp;
		
		
		
		
		
		return ans;
	}

}

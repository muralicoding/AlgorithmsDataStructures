package com.leetcode.slidingwindow;

import java.util.*;

public class minSumOfLengths {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,2,6,7,2,1,4,8};
		int target = 5;
		System.out.println(helper(arr, target));
	}
	
	public static int helper(int[] arr, int target) {
		
		int answer = -1;
		
		int i = 0;
		int j = 0;
		int size = arr.length;
		
		int sum = 0;

		int[] ans = new int[arr.length];
		Arrays.fill(ans, Integer.MAX_VALUE);
		int k = 0;
		
		while(j < size) {
			sum += arr[j];
			
			if(sum < target) {
				j++;
			}else if(sum == target) {
				ans[k++] = j - i + 1;	
				j++;
				sum = 0;
				i = j;
			}else if(sum > target) {
				while(sum > target) {
					sum -= arr[i];
					i++;
				}
				j++;
			}
			
		}
		
		Arrays.sort(ans);
		for(int c : ans) {
			System.out.println("***** " + c);
		}
		if(ans[0] > 0 && ans[1] > 0) {
			answer = ans[0] + ans[1];
		}
		
		return answer;
		
		
	}
}

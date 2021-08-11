package com.leetcode.slidingwindow;

import java.util.Arrays;

public class maxFrequency {

	public static void main(String[] args) {
		int[] nums = {3, 9, 6};
		Arrays.sort(nums);
		int k = 2;
		
		System.out.println(helper(nums, k));

	}
	
	public static int helper(int[] nums, int k) {
		int answer = 0;
		
		int i = 0;
		int j = 0;
		int size = nums.length;
		int sum = 0;
		
		while(j < size) {
			
			sum += nums[j];
			
			if(nums[j] * (j - i + 1) <= sum + k) {
				answer = Math.max(answer, j - i + 1);
				j++;
			}else {
				sum = sum - nums[i];
				i++;
				j++;
			}
		}
		return answer;
	}

}

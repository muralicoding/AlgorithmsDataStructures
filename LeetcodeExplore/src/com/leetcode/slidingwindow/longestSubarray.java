package com.leetcode.slidingwindow;

public class longestSubarray {

	public static void main(String[] args) {
		int[] nums = {1,1,0,0,1,1,1,0,1};
		//int[] nums = {1,1,1};
		System.out.println(helper(nums));
	}
	
	public static int helper(int[] nums) {
		int answer = 0;
		
		int i = 0;
		int j = 0;
		int size = nums.length;
		int count_zero = 0;

		
		while(j < size) {
			
			int num = nums[j];
			
			if(num == 0) {
				count_zero++;
			}
			
			if(count_zero <= 1) {
				answer = Math.max(answer, j - i + 1);
				j++;
			}else {
				if(nums[i] == 0) {
					count_zero--;
				}
				i++;
				j++;
			}
			
		}
		
				
		return --answer;
	}

}

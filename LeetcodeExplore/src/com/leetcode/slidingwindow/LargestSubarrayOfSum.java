package com.leetcode.slidingwindow;

public class LargestSubarrayOfSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int K = 3;	
		int size = arr.length;
		System.out.println(helper(arr, K, size));
	}
	
	public static int helper(int[] arr, int K, int size) {
		int max = Integer.MIN_VALUE;
		
		int i = 0;
		int j = 0;
		
		int sum = 0;
		
		while(j < size) {
			sum += arr[j];
			if(sum == K) {
				max = Math.max(max, j - i + 1);
				j++;
			}else if(sum < K) {
				j++;
			}else if(sum > K) {
				while(sum > K) {
					sum -= arr[i];
					i++;
				}
				j++;
			}
		}
		return max;
	}
}

package com.leetcode.slidingwindow;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 8, 2, 9, 1};
		int K = 3;
		System.out.println(maximum_sum_subarray(arr, K));
	}
	
	public static int maximum_sum_subarray(int[] arr, int K) {
		
		int size = arr.length;
		
		int i = 0;
		int j = 0;
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		while(j < size) {
			sum = sum + arr[j];
			
			if(j - i + 1 < K) {
				j++;
			}else if(j - i + 1 == K) {
				max= Math.max(sum, max);
				sum = sum - arr[i];
				i++;
				j++;
			}
			
		}
		return max;
	}

}

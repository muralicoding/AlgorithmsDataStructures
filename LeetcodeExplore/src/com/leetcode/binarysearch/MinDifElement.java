package com.leetcode.binarysearch;

public class MinDifElement {

	public static void main(String[] args) {
		int[] arr = {1,3,8,15};
		int target = 12;
		System.out.println(helper(arr, target));
	}
	
	public static int helper(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		int floor = 0;
		int ceil = 0;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return arr[mid];
			}else if(arr[mid] > target) {
				ceil = arr[mid];
				end = mid - 1;
			}else if(arr[mid] < target) {
				floor = arr[mid];
				start = mid + 1;
			}
		}
		return Math.abs(ceil - target) < Math.abs(floor - target) ? ceil : floor; 
	}

}

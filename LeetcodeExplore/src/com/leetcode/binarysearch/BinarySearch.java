package com.leetcode.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 100;
		System.out.println(helper(arr,target));
		
	}
	
	public static int helper(int[] arr, int target) {
		
		int size = arr.length;
		int start = 0;
		int end = size - 1;
		
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
		
			if(target == arr[mid]) {
				return mid;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}

}

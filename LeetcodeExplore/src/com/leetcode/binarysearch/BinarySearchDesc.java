package com.leetcode.binarysearch;

public class BinarySearchDesc {

	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int target = 1;
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
				//just change the "<" ----> ">"
			}else if(target > arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}

}

package com.leetcode.binarysearch;

public class NearlySortedArray {

	public static void main(String[] args) {
		//int[] arr = {3, 10, 20, 40, 50, 70, 80};
		int[] arr =  {10, 3, 40, 20, 50, 80, 70};
		int target = 100;
		System.out.println(helper(arr, target));

	}
	
	//Modified Binary Search
	
	public static int helper(int[] arr, int target) {
		
		int start = 0;
		int size = arr.length;
		int end = size - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(mid - 1 >= 0 && arr[mid - 1] == target) {
				return mid - 1;
			}else if(mid + 1 <= end && arr[mid + 1] == target) {
				return mid + 1;
			}
			
			if(target < arr[mid]) {
				end = mid - 2;
			}else {
				start = mid + 2;
			}
		}
		return -1;
	}

}

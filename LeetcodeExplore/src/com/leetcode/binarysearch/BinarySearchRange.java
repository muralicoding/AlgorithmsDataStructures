package com.leetcode.binarysearch;

public class BinarySearchRange {

	public static void main(String[] args) {
		int[] arr = {5, 7, 7, 8, 8, 8, 8, 10};
		int target = 8;
		int[] result = new int[2];
		result[0] = firstOccurence(arr, target);
		result[1] = lastOccurence(arr, target);
		
		//Below is the code for getting the frequency(no of occurrences) of target
		System.out.println(result[1] - result[0] + 1);
		

	}
	
	public static int firstOccurence(int[] arr, int target) {
		
		int size = arr.length;
		int start = 0;
		int end = size - 1;
		int res = -1;
		
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
		
			if(target == arr[mid]) {
				res = mid;
				end = mid - 1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return res;
		
	}
	
	public static int lastOccurence(int[] arr, int target) {
		
		int size = arr.length;
		int start = 0;
		int end = size - 1;
		int res = -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
		
			if(target == arr[mid]) {
				res = mid;
				start = mid + 1;
				
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return res;
	}
}

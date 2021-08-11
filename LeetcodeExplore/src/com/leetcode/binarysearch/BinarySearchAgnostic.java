package com.leetcode.binarysearch;

public class BinarySearchAgnostic {

	public static void main(String[] args) {
		//int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr = {1000, 200, 30, 4};
		int target = 30;
		
		if(arr[0] < arr[1]) {
			System.out.println(ascSearch(arr, target));
		}else {
			System.out.println(descSearch(arr, target));
		}

	}
	public static int ascSearch(int[] arr, int target) {
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
	
	public static int descSearch(int[] arr, int target) {
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

package com.leetcode.binarysearch;

public class CountRotations {

	public static void main(String[] args) {
		int[]   arr = {6, 7, 8, 9, 10};
		System.out.println(linearSearch(arr));
		System.out.println(BinarySearch(arr));
		
	}
	
	public static int linearSearch(int[] arr) {
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				min_index = i;
			}
			
		}
		return min_index;
	}
	
	public static int BinarySearch(int[] arr) {
		int start = 0;
		int N = arr.length;
		int end = N - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			int prev = (mid + N - 1) % N;
			int next = (mid + 1) % N;
			if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
				return mid;
			}
			
			if(arr[mid] >= arr[start] && arr[mid] <= arr[end]) {
				return start;
			}else if(arr[start] <= arr[mid]) {
				start = mid + 1;
			}else if(arr[mid] <= arr[end]) {
				end = mid - 1;
			}
		}
		
		return -1;
	}

}

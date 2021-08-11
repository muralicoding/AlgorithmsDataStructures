package com.leetcode.binarysearchonanswer;

public class PeakElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,5,6,7,8,9};
		System.out.println(helper(arr));
	}
	
	public static int helper(int[] arr) {
		
		int size = arr.length;
		if(size == 0) return -1;
	    if(size == 1) return 0;
		
		int start = 0;
		
		int end = size - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(mid > 0 && mid < size - 1) {
				if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
					return arr[mid];
				}else if(arr[mid] < arr[mid + 1]) {
					start = mid + 1;
				}else if(arr[mid] < arr[mid - 1]) {
					end = mid - 1;
				}
			}else if(mid == 0) {
				if(arr[0] > arr[1]) {
					return arr[0];
				}else {
					return arr[1];
				}
			}else if(mid == size - 1) {
				if(arr[size - 1] > arr[size - 2]) {
					return arr[size - 1];
				}else {
					return arr[size - 2];
				}
			}
			
		}
		
		
		
		return -1;
	}

}

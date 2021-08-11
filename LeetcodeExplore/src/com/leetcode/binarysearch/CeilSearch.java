package com.leetcode.binarysearch;

public class CeilSearch {

	public static void main(String[] args) {
		int[] arr =  {5, 10, 10, 12, 19};
		int target = 11;
		System.out.println(ceilSearch(arr, target));

	}
	
public static int ceilSearch(int[] arr, int target) {
		
		int start = 0;
		int size = arr.length;
		int end = size - 1;
		int res = -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				res = mid;
				end = mid - 1;
			}else if(arr[mid] < target) {
				start = mid + 1;
			}	
		}
		return  res;
	}
}

package com.leetcode.binarysearch;

public class FloorSearch {

	public static void main(String[] args) {
		int[] arr =  {5, 10, 10, 12, 19};
		int target = 5;
		System.out.println(floorSearch(arr, target));
	}
	
	public static int floorSearch(int[] arr, int target) {
		
		int start = 0;
		int size = arr.length;
		int end = size - 1;
		int res = -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else if(arr[mid] < target) {
				res = mid;
				start = mid + 1;
			}	
		}
		return  res;
	}

}

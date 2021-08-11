package com.leetcode.binarysearch;

public class BinarySearchInfiniteArray {

	public static void main(String[] args) {
		//consider this is an infinite array and we do not know
		//size and end index;
		int[] arr = {1,4,5,6,7,8,100,200,300,400,500,1000,2000,3000,4000,5000,6000,7000,8000};
		int target = 1;
		System.out.println(helper(arr, target));
	}
	
	public static int helper(int[] arr, int target) {
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			start = end;
			end = end * 2;
		}
		
		//at this point we will have start and end.
		//and we will apply binary search using start and end

		while (start <= end) {
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

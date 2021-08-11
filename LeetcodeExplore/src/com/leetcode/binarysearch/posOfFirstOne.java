package com.leetcode.binarysearch;

public class posOfFirstOne {

	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,0,0,0,0,0,
				     0,0,0,0,0,0,0,0,0,0,
				     0,0,0,0,0,0,0,0,0,0,
				     0,0,0,0,0,0,0,0,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1,
				     1,1,1,1,1,1,1,1,1,1
		
		};
		System.out.println(helper(arr));

	}

	private static int helper(int[] arr) {
		int answer = -1;
		
		int start = 0;
		int end = 1;
		
		int target = 1;
		
		while(target > arr[end]) {
			
			start = end;
			end = end * 2;
		}
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(target == arr[mid]) {
				answer = mid;
				end = end - 1;
			}else if(target < arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return answer;
	}
	

}

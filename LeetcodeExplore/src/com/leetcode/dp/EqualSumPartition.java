package com.leetcode.dp;

public class EqualSumPartition {

	public static void main(String[] args) {
		
		//inputs
		int[] arr = {1, 5, 11, 5};
					
		int n = arr.length;
		
		System.out.println(helperTabulationa(arr, n));

	}
	
public static boolean helperTabulationa(int[] arr, int n) {
		SubsetSum ss = new SubsetSum();
		boolean answer = false;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		if(sum % 2 != 0) {
			return false;
		}else if(sum % 2 == 0) {
			answer = SubsetSum.helperTabulation(arr, sum/2, n);
		}
		return answer;
	}

}

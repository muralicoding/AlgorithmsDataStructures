package com.leetcode.dp;

public class SubsetSum {
	
	static boolean[][] t;

	public static void main(String[] args) {
		int[] arr = {2, 3, 7, 8, 10};
		int sum = 11;
		int n = arr.length;
		t = new boolean[n+1][sum+1];
		
		System.out.println(helperTabulation(arr, sum, n));

	}
	
	public static boolean helperTabulation(int[] arr, int sum, int n) {
		
		//initialization
		
		for(int i = 0; i < n + 1; i++) {
			for(int j = 0; j < sum + 1; j++) {
				if(i == 0) {
					t[i][j] = false;
				}
				
				if(j == 0) {
					t[i][j] = true;
				}
			}
		}
		
		// choice diagram
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < sum+1; j++) {
				if(arr[i-1] > j) {
					t[i][j] = t[i-1][j];
				}else if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j]; 
				}
			}
		}
		
		return t[n][sum];
	}

}

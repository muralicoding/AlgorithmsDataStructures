package com.leetcode.dp;

public class KnapSackTabulation {
	
	static int[][] t; 

	public static void main(String[] args) {
		
		int[] wt = {1, 2, 5, 6, 7};
		int[] vl = {1, 6, 18, 22, 28};
		int W = 11;
		int n = wt.length;
		
		System.out.println(helperTabulation(wt, vl, W, n));

	}
	
	public static int helperTabulation(int[] wt, int[] vl, int W, int n) {
		
		//base condition changes to initialization;
		t = new int[n+1][W+1];
		
		for(int i = 0; i < n+1; i++) {
			for(int j = 0; j < W+1; j++) {
				if(i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}
		
		//choice diagram
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < W+1; j++) {
				if(wt[i-1] > j) {
					t[i][j] = t[i-1][j];
				}else if(wt[i-1] <= j) {
					t[i][j] = max (vl[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]); 
				}
			}
		}
		
		
		return t[n][W];
	}
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

}

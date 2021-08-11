package com.leetcode.dp;

public class KnapSack {
	
	static int[][] t; 

	public static void main(String[] args) {
		int[] wt = {1, 2, 5, 6, 7};
		int[] vl = {1, 6, 18, 22, 28};
		int W = 11;
		int n = wt.length;
		
		System.out.println(helperReucrsive(wt, vl, W, n));
		t = new int[n+1][W+1];
		for(int i =0; i < t.length; i++) {
			for(int j = 0; j < t[0].length; j++) {
				t[i][j] = -1;
			}
		}
		System.out.println(helperMemoization(wt, vl, W, n));
	}
	
	public static int helperReucrsive(int[] wt, int[] vl, int W, int n) {	
		//Base condition
		//Think of the smallest valid input for getting base condition
		if(n == 0 || W ==0) {
			return 0;
		}
		
		//Choice Diagram coding
		if(wt[n-1] > W) {
			return helperReucrsive(wt, vl, W, n-1);
		}else {
			return max(vl[n-1] + helperReucrsive(wt, vl, W - wt[n-1], n-1), helperReucrsive(wt, vl, W, n-1));
		}
	}
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int helperMemoization(int[] wt, int[] vl, int W, int n) {
		//Base condition
		//Think of the smallest valid input for getting base condition
		if(n == 0 || W ==0) {
			return 0;
		}
		
		if(t[n][W] != -1) {
			return t[n][W];
		}
		//Choice Diagram coding
		if(wt[n-1] > W) {
			return t[n][W] = helperReucrsive(wt, vl, W, n-1);
		}else {
			return t[n][W] = max(vl[n-1] + helperReucrsive(wt, vl, W - wt[n-1], n-1), helperReucrsive(wt, vl, W, n-1));
		}
	}
}

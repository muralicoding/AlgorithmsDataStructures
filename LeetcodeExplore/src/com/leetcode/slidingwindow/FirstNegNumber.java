package com.leetcode.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegNumber {

	public static void main(String[] args) {
		int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
		int K =3;
		
		helper(arr, K);

	}
	
	public static void helper(int[] arr, int K) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int size = arr.length;
		int i = 0;
		int j = 0;
		while(j < size) {
			if(arr[j] < 0) {
				queue.add(arr[j]);
			}
			if(j - i + 1 < K) {
				j++;
			}else if(j - i + 1 == K) {
				if(queue.peek() != null) {
					System.out.println(queue.peek());
				}else {
					System.out.println("0");
				}
				if(!queue.isEmpty() && queue.peek() == arr[i]) {
					queue.poll();
				}
				i++;
				j++;
			}
		}
	}

}

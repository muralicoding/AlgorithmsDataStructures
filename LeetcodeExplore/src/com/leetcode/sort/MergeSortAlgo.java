package com.leetcode.sort;

public class MergeSortAlgo {

	public static int[] mergeSort(int[] input) {
		// array length
		int length = input.length;
		
		if(length < 2) return input;
		
		int midpoint = length / 2;
		
		int[] left_array = new int[midpoint];
		int[] right_array = new int[length - midpoint];
		
		// fill the left_array and right_array
		
		for(int i = 0; i < midpoint; i++) {
			left_array[i] = input[i];
		}
		
		for(int i = midpoint ; i < length; i++) {
			right_array[i - midpoint] = input[i];
		}
		
		mergeSort(left_array);
		mergeSort(right_array);
		merge_left_right_array(input, left_array, right_array, midpoint, length-midpoint);
		
		return input;
	}
	
	public static void merge_left_right_array(int[] input, int[] left_array, int[] right_array, int left, int right) {
		//  First Iteration
		//  input = {10,1,9,6,5,4,2,3,7,8};
		//  left  = {10} //  right = {1}
		//  left = 1
		//  right = 1
		
		//  Another Iteration
		//  input = {10,1,9,6,5,4,2,3,7,8};
		//  left  = {1,10}   //  right = {5,6,9}
		//  left  = 2
		//  right = 3 
		
		int leftIndex = 0;
		int rightIndex = 0;
		int inputIndex = 0;
		
		while(leftIndex < left && rightIndex < right) {
			if(left_array[leftIndex] < right_array[rightIndex]) {
				input[inputIndex++] = left_array[leftIndex++];
			}else {
				input[inputIndex++] = right_array[rightIndex++];
			}
		}
		
		while(rightIndex < right) {
			input[inputIndex++] = right_array[rightIndex++];
		}
		
		while(leftIndex < left) {
			input[inputIndex++] = left_array[leftIndex++];
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] unsorted_array = {10,1,9,6,5,4,2,3,7,8};
	
		show(unsorted_array);
		
		int[] sorted_array = mergeSort(unsorted_array);
	
		show(sorted_array);
	}
	
	public static void show(int[] array) {
		for(int num: array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}

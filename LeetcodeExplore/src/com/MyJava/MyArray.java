package com.MyJava;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {

		arrayOperations();
		oneDimensionalArray();
		twoDimensionalArray();
		arraysClass();

	}

	private static void arrayOperations() {
		// 1. Initialize
		int[] a0 = new int[5];
		int[] a1 = { 1, 2, 3 };
		// 2. Get Length
		System.out.println("The size of a1 is: " + a1.length);
		// 3. Access Element
		System.out.println("The first element is: " + a1[0]);
		// 4. Iterate all Elements
		System.out.print("[Version 1] The contents of a1 are:");
		for (int i = 0; i < a1.length; ++i) {
			System.out.print(" " + a1[i]);
		}
		System.out.println();
		System.out.print("[Version 2] The contents of a1 are:");
		for (int item : a1) {
			System.out.print(" " + item);
		}
		System.out.println();
		// 5. Modify Element
		a1[0] = 4;
		// 6. Sort
		Arrays.sort(a1);
		
	}

	private static void arraysClass() {
		int[] source = {1,2,3,4,5};
		//Copying an Array Using Arrays.copyOf()
		int[] dest = Arrays.copyOf(source, 2);
		
		//Copying an Array Using Arrays.copyOfRange()
		int[] dest1   = Arrays.copyOfRange(source, 0, source.length-2);
		
		//Converting Arrays to Strings With Arrays.toString()
		System.out.println(Arrays.toString(dest));
		System.out.println(Arrays.toString(dest1));
		
		//Sorting Arrays
		int[] unsortedArray = {9, 10, 8, 7, 6, 5, 4, 3, 2, 1};
		Arrays.sort(unsortedArray);
		System.out.println(Arrays.toString(unsortedArray));
		
		//Filling Arrays With Arrays.fill()
		int[] intArray = new int[10];
		Arrays.fill(intArray, 123);
		System.out.println(Arrays.toString(intArray));
		
		int[] array = new int[10];
		Arrays.fill(array, 0, 5, 1122);
		System.out.println(Arrays.toString(array));
		
		//Searching Arrays with Arrays.binarySearch()
		int[] input = {2, 3, 4, 6, 6, 7, 8, 9};
		int index = Arrays.binarySearch(input, 6);
		System.out.println(index);
		
		//Checking if Arrays are Equal with Arrays.equals()
		int[] ints1 = {0,2,4,6,8,10};
		int[] ints2 = {0,2,4,6,8,10};
		int[] ints3 = {10,8,6,4,2,0};

		boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
		boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

		System.out.println(ints1EqualsInts2);
		System.out.println(ints1EqualsInts3);
	}

	public static void oneDimensionalArray() {
		//Declaring an Array Variable in Java
		//Instantiating an Array in Java
		int[] intArray = new int[5];
		String[] stringArray = new String[5];

		// Assigning values to an Array using index
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 2;

		stringArray[0] = "zero";
		stringArray[1] = "one";
		stringArray[2] = "two";

		//Shortcut for instantiating arrays
		int[] intArray1 = { 1, 2, 3, 4, 5 };
		String[] stringArray1 = { "One", "two", "three" };

		//Array Length
		System.out.println(intArray.length);


		//Iterating Arrays
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		for(int num: intArray1) {
			System.out.println(num);
		}

		for (String s : stringArray1) {
			System.out.print(s + " ");
		}
	}

	private static void twoDimensionalArray() {
		
		//Declaration and Instantiating a 2D Array in Java
		int[][] matrix = new int[2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		
		// Iterating a 2D Array in Java
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}

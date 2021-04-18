package com.coding.problems;

import com.coding.problems.utils.ArrayUtils;

/*
 * Given an input array containing only 3 numbers i.e. 0,1,2.
 * I/P Array - [0,1,2,0,2,1]
 * O/P Array - [0,0,1,1,2,2]
 * This is implemented using "Dutch National Flag Algorithim"
 */
public class CountZeroOneTwo {
	
	public void sort(int[] arr, int lengthOfArray) {
		
		int low = 0, mid = 0, high = lengthOfArray-1, temp =0;
		
		while (mid <= high) {

			switch (arr[mid]) {

			case 0:
				ArrayUtils.swap(arr, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				ArrayUtils.swap(arr, mid, high);
				high--;
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] inputArray = {0, 1, 2, 0, 1, 2, 2};
		System.out.println("Before sorting array:");
		ArrayUtils.printArray(inputArray);
		CountZeroOneTwo count = new CountZeroOneTwo();
		count.sort(inputArray, inputArray.length);
		System.out.println("After sorting array:");
		ArrayUtils.printArray(inputArray);
	}
}

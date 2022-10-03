package ie.gmit.cta;

import java.util.Arrays;

public class BubbleSort {

	// https://www.geeksforgeeks.org/bubble-sort/
	// Bubble Sort is the simplest sorting algorithm that works by repeatedly
	// swapping the adjacent elements if they are in the wrong order.

	public int[] bubbleSort(int arr[]) {
		int n = arr.length;		                // n = size of array 
		for (int i = 0; i < n - 1; i++)         // loop all array ------> T1 = n * T2
			for (int j = 0; j < n - i - 1; j++)	// loop	inside array ---> T2 = n * T3	
				if (arr[j] > arr[j + 1]) {      // swap element --------> T3 = a	
//					 swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
		return arr;
	}

	// Optimized Implementation:
	// The above function always runs O(n^2) time even if the array is sorted. It
	// can be optimized by stopping the algorithm if the inner loop didn’t cause any
	// swap.

	// An optimized version of Bubble Sort
	public int[] optBubbleSort(int arr[]) {
		int i, j, temp;
		int n = arr.length;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
		return arr;
	}

}

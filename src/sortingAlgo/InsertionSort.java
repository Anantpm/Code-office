/*
 * Insertion sort for integer array.
 * 
 */
package sortingAlgo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 8, 6, 4, 7, 2, 1 };
		System.out.println("Input array : " + Arrays.toString(a));
		insertionSort(a);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}
}

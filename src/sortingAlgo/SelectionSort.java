/*
 * Selection sort for integer array
 */
package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 64, 25, 12, 22, 11 };
		System.out.println("Input array : " + Arrays.toString(a));
		selectionSort(a);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}
			swap(a, i, min_index);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

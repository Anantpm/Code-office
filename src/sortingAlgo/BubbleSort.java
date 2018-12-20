/*
 * Bubble sort implementation for int array
 */
package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 10, 80, 30, 90, 40, 50, 70 };
		System.out.println("Input array : " + Arrays.toString(a));
		bubbleSort(a);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void bubbleSort(int[] a) {
		int n = a.length - 1;
		boolean swapped;
		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

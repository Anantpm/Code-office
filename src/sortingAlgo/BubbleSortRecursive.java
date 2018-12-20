/*
 * Recursive Bubble sort implementation for int array
 */
package sortingAlgo;

import java.util.Arrays;

public class BubbleSortRecursive {
	public static void main(String[] args) {

		int[] a = { 10, 80, 30, 90, 40, 50, 70 };
		System.out.println("Input array : " + Arrays.toString(a));
		bubbleRecSort(a, a.length);
		System.out.println("Sorted array : " + Arrays.toString(a));

	}

	private static void bubbleRecSort(int[] a, int n) {
		if (n == 1)
			return;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				swap(a, i, i + 1);
			}
		}
		bubbleRecSort(a, n - 1);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[i + 1];
		a[i + 1] = temp;
	}
}

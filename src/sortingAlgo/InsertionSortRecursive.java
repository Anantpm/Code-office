/*
 * Recursive insertion sort for integer array
 * 
 */
package sortingAlgo;

import java.util.Arrays;

public class InsertionSortRecursive {

	public static void main(String[] args) {
		int[] a = { 8, 6, 4, 7, 2, 1 };
		System.out.println("Input array : " + Arrays.toString(a));
		insertionRecSort(a, a.length);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void insertionRecSort(int[] a, int i) {
		if (i < 1) {
			return;
		}
		insertionRecSort(a, i - 1);

		int key = a[i - 1];
		int j = i - 2;
		while (j >= 0 && a[j] > key) {
			a[j + 1] = a[j];
			j--;
		}
		a[j + 1] = key;

	}

}

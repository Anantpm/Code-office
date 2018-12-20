/*
 * Quick sort implementation for int array
 *
 */
package sortingAlgo;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = { 8, 6, 4, 7, 2, 1 };
		System.out.println("Input array : " + Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void quickSort(int[] a, int low, int high)// 0 and 5
	{
		if (low < high) {
			int pi = partition(a, low, high);
			quickSort(a, low, pi - 1);
			quickSort(a, pi + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

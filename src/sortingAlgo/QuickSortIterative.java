/*
 * Quick sort in iterative manner for integer array
 */
package sortingAlgo;

import java.util.Arrays;

public class QuickSortIterative {
	public static void main(String[] args) {

		int[] a = { 8, 6, 4, 7, 2, 1 };
		System.out.println("Input array : " + Arrays.toString(a));
		IQuickSort(a, 0, a.length - 1);
		System.out.println("Sorted array : " + Arrays.toString(a));

	}

	private static void IQuickSort(int[] a, int l, int h) {
		int[] stack = new int[h - l + 1];
		int top = -1;

		stack[++top] = l;
		stack[++top] = h;

		while (top >= 0) {

			h = stack[top--];
			l = stack[top--];

			int pi = partition(a, l, h);
			System.out.println(Arrays.toString(a));

			if (pi - 1 > l) {
				stack[++top] = l;
				stack[++top] = pi - 1;
			}

			if (pi + 1 < h) {
				stack[++top] = pi + 1;
				stack[++top] = h;
			}
		}
	}

	private static int partition(int[] a, int low, int high) {
		int i = low - 1;
		int pivot = a[high];
		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, high);
		return (i + 1);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

/*
 * Iterative Merge Sort......
 * 
 */
package sortingAlgo;

import java.util.Arrays;

public class MergeSortIterative {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 4, 5 };
		System.out.println("Input array : " + Arrays.toString(a));
		mergeRec(a, a.length);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void mergeRec(int[] a, int len) {
		int curr_size;
		int left_start;

		for (curr_size = 1; curr_size < len; curr_size = curr_size * 2) {
			for (left_start = 0; left_start < len; left_start += 2 * curr_size) {
				int mid = left_start + curr_size - 1;
				int right_end = Math.min(left_start + 2 * curr_size - 1, len - 1);
				merge(a, left_start, mid, right_end);
			}
		}
	}

	private static void merge(int[] a, int left_start, int mid, int right_end) {
		int i, j, k;
		int l1 = mid - left_start + 1;
		int l2 = right_end - mid;

		int[] L = new int[l1];
		int[] R = new int[l2];

		for (i = 0; i < l1; i++)
			L[i] = a[left_start + i];

		for (j = 0; j < l2; j++)
			R[j] = a[mid + 1 + j];

		i = 0;
		j = 0;
		k = left_start;

		while (i < l1 && j < l2) {
			if (L[i] <= R[j]) {
				a[k] = L[i++];
			} else if (L[i] > R[j]) {
				a[k] = R[j++];
			}
			k++;
		}

		while (i < l1) {
			a[k++] = L[i++];
		}

		while (j < l2) {
			a[k++] = R[j++];
		}
	}

}

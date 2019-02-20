package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given two sorted arrays, the task is to merge them in a
 *         sorted manner.
 * 
 *         Input : arr1[] = { 1, 3, 4, 5 } arr2[] = { 2, 4, 6, 8}
 *
 *         Output : arr3[] = {1, 2, 3, 4, 5, 6, 7, 8}
 *
 */
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5 };
		int[] b = { 2, 4, 6, 8 };
		int[] res = merge(a, b);
		System.out.println("Merged array is = " + Arrays.toString(res));
	}

	private static int[] merge(int[] a, int[] b) {
		if (a == null && b == null)
			return null;
		else if (b == null || b.length == 0)
			return a;
		else if (a == null || a.length == 0)
			return b;
		int[] result = new int[a.length + b.length - 1];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				result[k++] = a[i++];
				j++;
			} else {
				result[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
			}
		}

		while (i < a.length)
			result[k++] = a[i++];

		while (j < b.length)
			result[k++] = b[j++];

		return result;
	}
}

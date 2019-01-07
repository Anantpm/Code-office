/*
 * Binary search in without recursion.
 * Input array must be sorted.
 */
package searchingAlgo;

import java.util.Arrays;

public class BinaryIterativeSearch {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 10, 40 };
		int n = 45;
		int val = binaryISearch(a, n, 0, a.length - 1);
		if (val != -1)
			System.out.println(n + " : present in the array " + Arrays.toString(a));
		else
			System.out.println(n + " : not present in the array " + Arrays.toString(a));
	}

	private static int binaryISearch(int[] a, int n, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (n == a[mid])
				return mid;
			else if (n < a[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}

/*
 * Binary search with recursion.
 * Input array must be sorted.
 */
package searchingAlgo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 10, 40 };
		int n = 40;
		int val = binarySearch(a, n, 0, a.length - 1);
		if (val != -1)
			System.out.println(n + " : present in the array " + Arrays.toString(a));
		else
			System.out.println(n + " not present in the array " + Arrays.toString(a));
	}

	private static int binarySearch(int[] a, int n, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (n == a[mid])
			return mid;
		else if (n < a[mid])
			return binarySearch(a, n, low, mid - 1);
		return binarySearch(a, n, mid + 1, high);
	}

}

/*
 * Binary Search on sorted and rotated array... 
 */
package searchingAlgo;

import java.util.Arrays;

public class BinarySearchOnRotatedArray {

	public static void main(String[] args) {
		int[] a = { 40, 2, 3, 4, 10 };
		int n = 40;
		int val = bSearch(a, n, 0, a.length - 1);
		System.out.println(val);
		if (val != -1)
			System.out.println(Arrays.toString(a) + " : contains " + n);
		else
			System.out.println(Arrays.toString(a) + " : does not contain " + n);
	}

	private static int bSearch(int[] a, int n, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if(n == a[mid])
			return mid;
		if (a[low] <= a[mid]) {
			if (n >= a[low] && n <= a[mid])
				return bSearch(a, n, low, mid - 1);
			return bSearch(a, n, mid + 1, high);
		}

		if (n >= a[mid] && n <= a[high]) {
			return bSearch(a, n, mid + 1, high);
		}

		return bSearch(a, n, low, mid - 1);
	}

}

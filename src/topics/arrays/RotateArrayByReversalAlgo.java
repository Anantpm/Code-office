package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Rotating the array using reversing algorithm.
 * 
 *         Input : arr[] = [1, 2, 3, 4, 5, 6, 7] , d = 2
 *
 *         output : arr[] = [3, 4, 5, 6, 7, 1, 2]
 *
 */
public class RotateArrayByReversalAlgo {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		rotate(a, d);
		System.out.println(Arrays.toString(a));
	}

	private static void rotate(int[] a, int d) {
		reverse(a, 0, d - 1);
		reverse(a, d, a.length - 1);
		reverse(a, 0, a.length - 1);
	}

	private static void reverse(int[] a, int i, int j) {
		while (i < j) {
			swap(a, i, j);
			i++;
			j--;
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

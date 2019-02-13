package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of colors red, white and blue sort them so
 *         that objects of the same colors in the order red(0), white(1) and
 *         blue(2).
 * 
 *         Input : {0, 1, 2, 0, 1, 2}
 *
 *         Output : {0, 0, 1, 1, 2, 2}
 *
 */
public class SortColors {
	public static void main(String[] args) {
		int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
//		sortColor(a);
		sortByAlgo(a);
	}

	// Dutch National Flag Algorithm.
	private static void sortByAlgo(int[] a) {
		int low = 0;
		int high = a.length - 1;
		int temp = 0;
		int mid = 0;
		while (mid <= high) {

			switch (a[mid]) {
			case 0: {
				swap(a, low, mid);
				low++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;

			case 2: {
				swap(a, mid, high);
				high--;
				break;
			}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	private static void sortColor(int[] a) {
		int i = 0, one = 0, two = 0;
		while (i < a.length) {
			if (a[i] == 0) {
				a[i] = a[two];
				a[two] = a[one];
				a[one] = 0;
				one++;
				two++;
			} else if (a[i] == 1) {
				swap(a, i, two);
				two++;
			}
			i++;
		}
		System.out.println("Result = " + Arrays.toString(a));
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}

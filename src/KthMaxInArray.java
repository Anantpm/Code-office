/*
 * Finding kth Max element in an array.
 */
import java.util.Arrays;

public class KthMaxInArray {
	public static void main(String[] args) {
		int[] a = { 8, 6, 4, 7, 2, 1 };
		int k = 4;
		System.out.println(k + "th Highest Element in the array is :- " + getKthMax(a, 0, a.length - 1, k));
	}

	// l=0 and r=5
	private static int getKthMax(int[] a, int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			int pos = partition(a, l, r);
			System.out.println(pos);
			if (pos - l == k - 1)
				return a[pos];
			if (pos - l > k - 1)
				return getKthMax(a, l, pos - 1, k);
			return getKthMax(a, pos + 1, r, k - pos + l - 1);
		}
		return 0;

	}

	private static int partition(int[] a, int l, int r) {
		int pivot = a[r];
		int i = l;
		for (int j = l; j < r; j++) {
			if (a[j] >= pivot) {
				swap(a, i, j);
				i++;
			}
		}
		swap(a, i, r);
		System.out.println(Arrays.toString(a));
		return i;
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}

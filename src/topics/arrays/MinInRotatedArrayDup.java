package topics.arrays;

/**
 * @author Anant Manjulkar Problem : A sorted array is rotated at some unknown
 *         point, find the minimum element in it. Assume no duplicates elements
 *         in the array.
 * 
 *         Input : [ 4, 4, 6, 7, 0, 1, 2, 4 ]
 *
 *         Output : 0
 *
 */
public class MinInRotatedArrayDup {

	public static void main(String[] args) {
		int[] a = { 4, 4, 6, 7, 0, 1, 2, 4 };
		int min = findMinInRArray(a);
		System.out.println("Minimum in the Rotated Array : " + min);
	}

	private static int findMinInRArray(int[] a) {
		if (a == null || a.length == 0)
			return 0;
		if (a.length == 1)
			return a[0];
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (a[mid] < a[end])
				end = mid;
			if (a[mid] > a[end])
				start = mid + 1;
			else
				end--;
		}
		return a[start];
	}

}

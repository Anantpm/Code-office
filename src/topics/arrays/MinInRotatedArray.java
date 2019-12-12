package topics.arrays;

/**
 * @author Anant Manjulkar Problem : A sorted array is rotated at some unknown
 *         point, find the minimum element in it. Assume no duplicates elements
 *         in the array.
 * 
 *         Input : [ 5, 6, 1, 2, 3, 4]
 *
 *         Output : 1
 *
 */
public class MinInRotatedArray {

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 1, 2 };
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
			int mid = (start + end);
			if (a[mid] > 0 && a[mid] < a[mid - 1])
				return a[mid];
			if (a[mid] >= a[start] && a[mid] > a[end])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return a[start];
	}

}

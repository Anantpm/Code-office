package topics.arrays;

/**
 * @author Anant Manjulkar
 * 
 *         Problem : Peak Element is the element which is greater than it's
 *         neighbors. Given an array of integers. Find a peak element in it.
 * 
 *         Input : [ 5, 10, 20, 15]
 *
 *         Output : 20
 *
 */
public class PeakElement {

	public static void main(String[] args) {
		int[] a = { 5, 10, 20, 15 };
		findPeak(a);
	}

	private static void findPeak(int[] a) {
		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if (a[mid] < a[mid + 1])
				start = mid + 1;
			else
				end = mid;
		}
		System.out.println("Peak Element = " + a[start]);
	}

}

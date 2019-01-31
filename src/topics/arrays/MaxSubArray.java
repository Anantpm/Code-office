package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Write an efficient program to find the sum of contiguous
 *         subarray within a one-dimensional array of numbers which has the
 *         largest sum (KADANE's algorithm)
 * 
 *         Input : [ -2, -3, 4, -1, -2, 1, 5, -3]
 *
 *         Output : [ 4, -1, -2, 1, 5]
 *
 */
public class MaxSubArray {
	public static void main(String[] args) {
		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maxSubArray(a);
	}

	private static void maxSubArray(int[] a) {
		int max_ending_here = 0;
		int max_so_far = 0;
		int end = 0, start = 0;
		for (int i = 0; i < a.length; i++) {
			max_ending_here += a[i];
			if (max_so_far < max_ending_here) {
				end = i;
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				start = i + 1;
			}
		}
		System.out.println("Start Index : " + start + "   End Index: " + end);
		System.out.println("Maximum sum = " + max_so_far);
	}
}

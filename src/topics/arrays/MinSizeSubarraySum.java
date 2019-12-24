package topics.arrays;

/**
 * @author Anant Manjulkar
 * 
 *         Problem :Given an array of n positive integers and a positive integer
 *         s, find the minimal length of a contiguous subarray of which the sum
 *         greater than or equal to s. If there isn't one, return 0 instead.
 * 
 *         Input: s = 7, nums = [2,3,1,2,4,3]
 * 
 *         Output: 2
 * 
 *         Explanation: the subarray [4,3] has the minimal length under the
 *         problem constraint
 *
 */

public class MinSizeSubarraySum {

	public static void main(String[] args) {
		int[] a = { 2, 3, 1, 2, 4, 3 };
		int sum = 7;
		int min_length = findMinSubArr(a, sum);
		System.out.println("Minimum length = " + min_length);
	}

	private static int findMinSubArr(int[] a, int s) {
		if (a == null || a.length == 0)
			return 0;
		int sum = 0;
		int min_len = Integer.MAX_VALUE;
		int start = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			while (sum >= s) {
				min_len = Math.min(min_len, i + 1 - start);
				sum -= a[start];
				start++;
			}
		}
		return min_len == Integer.MAX_VALUE ? 0 : min_len;
	}

}

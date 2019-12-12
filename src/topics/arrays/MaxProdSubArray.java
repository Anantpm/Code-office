package topics.arrays;

/**
 * @author Anant Manjulkar
 * 
 *         Problem :Given an array that contains both positive and negative
 *         integers, find the product of the maximum product subarray.
 * 
 *         Input : [ 6, -3, -10, 0, 2]
 *
 *         Output : 180
 *
 */
public class MaxProdSubArray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 0, -2, -40 };
		maxProductSubArray(arr);
	}

	private static void maxProductSubArray(int[] a) {
		if (a.length == 0)
			return;
		int current_max = a[0];
		int current_min = a[0];
		int final_max = a[0];
		for (int i = 1; i < a.length; i++) {
			int temp = current_max;

			current_max = Math.max(Math.max(current_max * a[i], current_min * a[i]), a[i]);

			current_min = Math.min(Math.min(temp * a[i], current_min * a[i]), a[i]);

			if (current_max > final_max)
				final_max = current_max;
		}
		System.out.println("Maximum Product : " + final_max);
	}

}

package topics.arrays;

import java.sql.Array;
import java.util.Arrays;

/**
 * @author Anant Manjulkar
 * 
 *         Problem : Given an array arr[] of n integers, construct a Product
 *         Array prod[] (of same size) such that prod[i] is equal to the product
 *         of all the elements of arr[] except arr[i]. Solve it without division
 *         operator and in O(n)
 * 
 *         Input : [10, 3, 5, 6, 2]
 *
 *         Output : [180, 600, 360, 300, 900]
 * 
 *
 */

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		getProductSelf(a);
	}

	private static void getProductSelf(int[] a) {
		int N = a.length;

		int[] result = new int[N];

		result[0] = 1;

		for (int i = 1; i < N; i++)
			result[i] = result[i - 1] * a[i - 1];

		// define variable for saving right product value
		int R = 1;
		for (int i = N - 1; i >= 0; i--) {
			result[i] = result[i] * R;
//			System.out.println("R = " + R);
			R = R * a[i];
		}
		System.out.println(Arrays.toString(result));
	}

}

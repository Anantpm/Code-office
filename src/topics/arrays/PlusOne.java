package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a non-negative integer represented as a non-negative
 *         empty array of digits, plus one to the integer. You may assume the
 *         integer do not contain any leading zero, except the number 0 itself.
 *         The digits are stored such that the most significant digit is first
 *         element of array.
 * 
 *         Input : [1, 2, 4] [9, 9, 9]
 *
 *         Output : [1, 2, 5] [1, 0, 0, 0]
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		int[] a = { 9, 9, 8 };
		int[] result = plusOne(a);
		System.out.println("Plus one number = " + Arrays.toString(result));
	}

	private static int[] plusOne(int[] a) {
		int[] result = new int[a.length + 1];
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < 9) {
				a[i]++;
				return a;
			}
			a[i] = 0;
		}
		result[0] = 1;
		return result;
	}

}

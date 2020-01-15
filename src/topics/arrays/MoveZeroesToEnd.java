package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of random numbers, Push all the zero’s of a
 *         given array to the end of the array.
 * 
 *         Input : [1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0]
 *
 *         Output : [1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0]
 */

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] a = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
		shiftZeroesToEnd(a);
		System.out.println(Arrays.toString(a));
	}

	private static void shiftZeroesToEnd(int[] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				a[cnt++] = a[i];
		}
		while (cnt < a.length)
			a[cnt++] = 0;
	}

}

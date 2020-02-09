package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of integers some elements appear twice and
 *         others appear once.
 * 
 *         Find all the elements of [1, n] inclusive that do not appear in this
 *         array.
 * 
 *         Could you do it without extra space and in O(n) runtime? You may
 *         assume the returned list does not count as extra space
 * 
 *         Input : [4,3,2,7,8,2,3,1]
 *
 *         Output : [5,6]
 */

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappear(a);
	}

	private static void findDisappear(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int index = Math.abs(a[i]) - 1;
			if (a[index] < 0)
				System.out.println(i);
			else
				a[index] = -a[index];
		}

		System.out.println(Arrays.toString(a));
	}

}

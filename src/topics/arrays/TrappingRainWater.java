package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given n non-negative integers representing an elevation map
 *         where the width of each bar is 1, compute how much water it is able
 *         to trap after raining.
 * 
 *         Input : arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 *
 *         Output : 6
 *
 */
public class TrappingRainWater {

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(Arrays.toString(a));
		int water = trappedWater(a);
		System.out.println("Total water trapped = " + water);
	}

	private static int trappedWater(int[] a) {
		int water = 0;
		int[] left = new int[a.length];
		int[] right = new int[a.length];

		left[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			left[i] = Math.max(left[i - 1], a[i]);
		}
		System.out.println("left :" + Arrays.toString(left));

		right[a.length - 1] = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], a[i]);
		}
		System.out.println("right :" + Arrays.toString(right));

		for (int i = 0; i < a.length; i++) {
			water = water + (Math.min(left[i], right[i]) - a[i]);
		}

		return water;
	}

}

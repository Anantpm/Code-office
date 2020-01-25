package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a non-empty array of integers, return the third
 *         maximum number in this array. If it does not exist, return the
 *         maximum number. The time complexity must be in O(n).
 * 
 *         Input : [3, 2, 1]
 *
 *         Output : 1
 */

public class ThirdMaxNumber {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3 };
		getThirdMax(a);
	}

	private static void getThirdMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int n : a) {
			if (max == n || secMax == n || thirdMax == n)
				continue;
			if (max < n) {
				thirdMax = secMax;
				secMax = max;
				max = n;
			} else if (secMax < n) {
				thirdMax = secMax;
				secMax = n;
			} else if (thirdMax < n)
				thirdMax = n;
		}
		if (thirdMax == Integer.MIN_VALUE)
			System.out.println("Third Max : " + max);
		else
			System.out.println("Third Max : " + thirdMax);
	}

}

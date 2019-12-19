package topics.arrays;

/**
 * @author Anant Manjulkar
 * 
 *         Problem : Given an array of integers that is already sorted in
 *         ascending order, find two numbers such that they add up to a specific
 *         target number.The function twoSum should return indices of the two
 *         numbers such that they add up to the target, where index1 must be
 *         less than index2.
 * 
 *         Input : [2,7,11,15] , target = 9
 *
 *         Output : [1,2]
 *
 */

public class TwoSumII {

	public static void main(String[] args) {
		int[] a = { 2, 7, 11, 15 };
		int target = 9;
		findSumPair(a, target);
	}

	private static void findSumPair(int[] a, int target) {
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int sum = a[i] + a[j];
			if (sum < target)
				i++;
			else if (sum > target)
				j--;
			else {
				System.out.println("pair found : " + i + "," + j);
				break;
			}
		}
	}

}

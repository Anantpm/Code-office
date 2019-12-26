package topics.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of integers and an integer k, find out
 *         whether there are two distinct indices i and j in the array such that
 *         nums[i] = nums[j] and the absolute difference between i and j is at
 *         most k.
 * 
 *         Input : [1,2,3,1] , k=3
 *
 *         Output : true
 *
 */

public class ContainsDupII {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 2, 3 };
		int k = 3;
		System.out.println(findDup(a, k));
	}

	private static boolean findDup(int[] a, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i])) {
				return true;
			}
			set.add(a[i]);
			if (i >= k)
				set.remove(a[i - k]);

		}
		return false;

	}

}

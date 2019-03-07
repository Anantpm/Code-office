package topics.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an unsorted array of integers, find the length of the
 *         longest consecutive elements sequence.
 * 
 *         Input : [100, 4, 200, 1, 3, 2]
 *
 *         Output : [1, 2, 3, 4] , length is 4.
 *
 */
public class LongestConsecutiveSeq {
	public static void main(String[] args) {
		int[] a = { 36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42 };
		getLongSeq(a);
	}

	private static void getLongSeq(int[] a) {
		Set<Integer> hashset = new HashSet<>();
		int length = 0;
		for (int n : a)
			hashset.add(n);
		for (int n : a) {
			if (!hashset.contains(n - 1)) {
				int j = n;
				while (hashset.contains(j)) {
					j++;
				}
				if (length < j - n)
					length = j - n;
			}
		}
		System.out.println("Length of the Longest consecutive subsequence = " + length);
	}
}

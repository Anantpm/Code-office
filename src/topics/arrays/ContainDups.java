package topics.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of integers, find if the array contains any
 *         duplicates.
 * 
 *         Your function should return true if any value appears at least twice
 *         in the array, and it should return false if every element is
 *         distinct.
 * 
 *         Input : [1,1,1,3,3,4,3,2,4,2]
 *
 *         Output : true
 *
 */

public class ContainDups {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		boolean flag = findDups(a);
		if (flag)
			System.out.println("Contains Duplicates");
		else
			System.out.println("No Duplicates");
	}

	private static boolean findDups(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		for (int element : a) {
			if (set.contains(element))
				return true;
			else
				set.add(element);
		}

		return false;
	}

}

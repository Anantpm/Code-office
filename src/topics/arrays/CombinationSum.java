package topics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a set of candidate numbers (C) and target number (T),
 *         find all unique combinations in C where the candidate numbers sums to
 *         T
 * 
 *         Input : [ 2,3,6,7 ] and target = 7
 *
 *         Output :[ [7] , [2,2,3] ]
 *
 */
public class CombinationSum {

	public static void main(String[] args) {
		int[] a = { 2, 4, 8, 6 };
		int target = 8;
		getAllCombinations(a, target);
	}

	private static void getAllCombinations(int[] a, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> curr = new ArrayList<>();

		if (a == null || a.length == 0)
			return;
		Arrays.sort(a);

		combinationSum(a, target, curr, result, 0);
		System.out.println(result);
	}

	private static List combinationSum(int[] a, int target, ArrayList<Integer> curr,
			ArrayList<ArrayList<Integer>> result, int i) {
		if (target < 0)
			return result;
		else if (target == 0) {
			result.add(new ArrayList<>(curr));
		} else {
			for (int j = i; j < a.length; j++) {
				curr.add(a[j]);
				combinationSum(a, target - a[j], curr, result, j);
				curr.remove(curr.size() - 1);
			}
		}
		return result;
	}

}

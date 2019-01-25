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
 *         Input : [10,1,2,7,6,1,5]
 *
 *         Output : [ [1,7],[1,2,5],[2,6],[1,1,6] ]
 *
 */
public class CombinationSumWithOneElementAtOnce {

	public static void main(String[] args) {
		int[] a = { 10, 1, 2, 7, 6, 1, 5 };
		int sum = 8;
		getCombinations(a, sum);
	}

	private static void getCombinations(int[] a, int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		if (a == null || a.length == 0)
			return;
		Arrays.sort(a);
		backtrack(a, sum, new ArrayList<>(), result, 0);
		System.out.println(result);
	}

	private static List backtrack(int[] a, int sum, ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> result,
			int i) {
		if (sum < 0)
			return result;
		else if (sum == 0 && !result.contains(tempList))
			result.add(new ArrayList<>(tempList));
		else {
			for (int j = i; j < a.length; j++) {
				tempList.add(a[j]);
				backtrack(a, sum - a[j], tempList, result, j + 1);
				tempList.remove(tempList.size() - 1);
			}
		}
		return result;
	}

}

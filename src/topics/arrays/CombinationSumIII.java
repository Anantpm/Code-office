package topics.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anant Manjulkar
 * 
 *         Problem :Find all possible combinations of k numbers that add up to a
 *         number n, given that only numbers from 1 to 9 can be used and each
 *         combination should be a unique set of numbers
 * 
 *         Input: k = 3, n = 7
 * 
 *         Output: [[1,2,4]]
 * 
 */

public class CombinationSumIII {

	public static void main(String[] args) {
		int k = 3;
		int n = 7;
		findCombinations(k, n);
	}

	private static void findCombinations(int k, int n) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		List<Integer> combiList = new ArrayList<Integer>();
		combinations(results, combiList, k, n, 1);
		System.out.println("Combinations are : " + results);
	}

	private static void combinations(List<List<Integer>> results, List<Integer> combiList, int k, int n,
			int startIndex) {
		if (k < 0 || n < 0)
			return;
		if (n == 0 && k == 0)
			results.add(new ArrayList<Integer>(combiList));
		else {
			for (int i = startIndex; i <= 9; i++) {
				combiList.add(i);
				combinations(results, combiList, k - 1, n - i, i+1);
				combiList.remove(combiList.size() - 1);
			}
		}
	}

}

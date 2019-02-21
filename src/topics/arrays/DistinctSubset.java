package topics.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a set of positive integers, find all its subsets. The
 *         set can contain duplicate elements, so any repeated subset should be
 *         considered only once in the output.
 * 
 *         Input : S = {1, 2, 2}
 *
 *         Output : {}, {1}, {2}, {1, 2}, {2, 2}, {1, 2, 2}
 *
 */
public class DistinctSubset {

	public static void main(String[] args) {
		int[] S = { 1, 2, 2 };
		getDistinctSubset(S);

	}

	private static void getDistinctSubset(int[] s) {
		Set<String> set = new HashSet<>();
		int n = s.length;
		for (int i = 0; i < (1 << n); i++) {
			String str = "{ ";
			for (int j = 0; j < n; j++)
				if ((i & (1 << j)) > 0)
					str = str.concat(s[j] + " ");
			str += "}";
			set.add(str);
		}
		System.out.println(set);
	}

}

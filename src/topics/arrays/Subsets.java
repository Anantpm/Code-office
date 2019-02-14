package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Find all the subsets of a given set
 * 
 *         Input : S = {a, b, c, d}
 *
 *         Output : {}, {a} , {b}, {c}, {d}, {a,b}, {a,c}, {a,d}, {b,c}, {b,d},
 *         {c,d}, {a,b,c}, {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}
 *
 */
public class Subsets {
	public static void main(String[] args) {
		char[] S = { 'a', 'b', 'c', 'd' };
		getSubsets(S);
	}

	private static void getSubsets(char[] s) {
		int n = s.length;
		for (int i = 0; i < (1 << n); i++) {
			System.out.print("{ ");
			for (int j = 0; j < n; j++) {
				if ((i & 1 << j) > 0)
					System.out.print(s[j]+" ");
			}
			System.out.print("}, ");
		}
	}
}

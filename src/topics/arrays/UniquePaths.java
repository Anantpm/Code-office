package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : count all the possible paths from top left to bottom right
 *         of a mXn matrix with the constraints that from each cell you can
 *         either move only to right or down
 * 
 *         Input : m = 2, n = 2
 *
 *         Output : 2
 *
 */
public class UniquePaths {
	public static void main(String[] args) {
		int m = 3, n = 7;
		System.out.println(getUniquePaths(m, n));
	}

	private static int getUniquePaths(int m, int n) {
		int count = 1;
		int N = m + n - 2;
		int k = m - 1;
		/*N C k = N!/k!(N-k)!
		        = (N-k+1)*(N-k+2)*(N-k+3)...N/k!
		        = (N-k+1)/1 * (N-k+2)/2 * (N-k+3)/3....N/k;
		  */
		for (int i = 1; i <= k; i++) {
			count *= (N - k + i) / i;
		}
		return count;
	}
}

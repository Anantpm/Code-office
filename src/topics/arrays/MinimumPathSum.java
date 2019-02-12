package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a m*n grid filled with positive numbers , find a path
 *         from top left to bottom right which minimizes the sum of all numbers
 *         along its path.
 * 
 *         Input :
 *
 *         Output :
 *
 */
public class MinimumPathSum {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 9, 8, 7 }, { 4, 5, 6 } };
		minimumSum(a);
	}

	private static void minimumSum(int[][] a) {
		int sum = a[0][0];
		int m = a.length;
		int n = a[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0)
					a[i][j] = a[i][j] + a[i][j - 1];
				else if (i != 0 && j == 0)
					a[i][j] = a[i][j] + a[i - 1][j];
				else if (i == 0 && j == 0)
					a[i][j] = a[i][j];
				else
					a[i][j] = a[i][j] + Math.min(a[i - 1][j], a[i][j - 1]);
			}
		}
		System.out.println("Minimum path sum is: " + a[m - 1][n - 1]);
	}

}

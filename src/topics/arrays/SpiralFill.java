package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a integer n, generate a square matrix filled with
 *         elements from 1 to n2 in spiral order.
 * 
 *         Input : n = 3
 *
 *         Output : [[1,2,3][8,9,4][7,6,5]]
 *
 */
public class SpiralFill {

	public static void main(String[] args) {
		int n = 4;
		int[][] res = generateSpiralMatrix(n);
		System.out.println(Arrays.deepToString(res));
	}

	private static int[][] generateSpiralMatrix(int n) {
		int l = 0, k = 0;
		int m = n, val = 1;
		int[][] result = new int[m][n];
		while (k < m && l < n) {
			int i;
			for (i = l; i < n; ++i) {
				result[k][i] = val++;
			}
			k++;
			for (i = k; i < m; ++i) {
				result[i][n - 1] = val++;
			}
			n--;
			if (l < n) {
				for (i = n - 1; i >= l; --i) {
					result[m - 1][i] = val++;
				}
				m--;
			}
			if (k < m) {
				for (i = m - 1; i >= k; --i) {
					result[i][l] = val++;
				}
				l++;
			}

		}
		return result;
	}

}

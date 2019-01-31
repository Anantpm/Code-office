package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a 2D array, print it in spiral form.
 * 
 *         Input : [{1, 2, 3, 4}, {5, 6, 7, 8},{ 9, 10, 11, 12},{ 13, 14, 15, 16}]
 * 
 *
 *         Output : [ 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10 ]
 *
 */
public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] a = { {1, 2, 3, 4}, {5, 6, 7, 8},{ 9, 10, 11, 12},{ 13, 14, 15, 16} };
		printSpiral(a, 4, 4);
	}

	private static void printSpiral(int[][] a, int m, int n) {
		int k = 0, l = 0, i = 0;
		while (k < m && l < n) {
			for (i = k; i < n; ++i)
				System.out.print(a[k][i] + ", ");
			k++;
			for (i = k; i < m; ++i)
				System.out.print(a[i][n - 1] + ", ");
			n--;
			if (k < m) {
				for (i = n - 1; i >= l; --i)
					System.out.print(a[m - 1][i] + ", ");
				m--;
			}
			if (l < n) {
				for (i = m - 1; i > l; --i)
					System.out.print(a[i][l] + ", ");
				l++;
			}
		}
	}
}

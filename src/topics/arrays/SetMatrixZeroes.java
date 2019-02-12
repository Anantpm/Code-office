package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a 2D array, if an element is 0, set its entire row
 *         and column to 0. Do it in place.
 * 
 *         Input : {{1,2,0},{3,0,4},{5,6,7}}
 *
 *         Output : {{0,0,0},{0,0,0},{5,0,0}}
 *
 */
public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 0 }, { 3, 4, 0 }, { 5, 6, 0 } };
		setZeroes(a);
	}

	private static void setZeroes(int[][] a) {
		boolean rowFlag = false;
		boolean columnFlag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == 0 && a[i][j] == 0)
					rowFlag = true;
				if (j == 0 && a[i][j] == 0)
					columnFlag = true;
				if (a[i][j] == 0) {
					a[0][j] = 0;
					a[i][0] = 0;
				}

			}
		}

		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				if (a[0][j] == 0 || a[i][0] == 0) {
					a[i][j] = 0;
				}

			}
		}

		if (rowFlag == true) {
			for (int i = 0; i < a[0].length; i++) {
				a[0][i] = 0;
			}
		}

		if (columnFlag == true) {
			for (int i = 0; i < a.length; i++) {
				a[i][0] = 0;
			}
		}
		System.out.println(" Result:  "+Arrays.deepToString(a));
	}
}

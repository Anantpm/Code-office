package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a triangular structure of numbers, find the minimum
 *         path sum from top to bottom. Each step you may move to adjacent
 *         numbers on the row below
 * 
 *         Input :   	2
  					   3 7
 					  8 5 6
					 6 1 9 3
 *
 *         Output : 11 (2 + 3 + 5 + 1 = 11)
 *
 */
public class Triangle {
	public static void main(String[] args) {
		int[][] a = { { 2 }, { 3, 7 }, { 8, 5, 6 }, { 6, 1, 9, 3 } };
		minimumPathSumTriangle(a);
	}

	private static void minimumPathSumTriangle(int[][] a) {
		int result[] = new int[a.length];
		int n = a.length - 1;
		for (int i = 0; i < a[n].length; i++)
			result[i] = a[n][i];

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < a[i + 1].length - 1; j++)
				result[j] = a[i][j] + Math.min(result[j], result[j + 1]);
		}
		System.out.println("Minimum Path Sum in a Triangle = " + result[0]);

	}

}

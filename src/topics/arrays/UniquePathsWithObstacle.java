package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a grid of size m * n, let us assume you are starting
 *         at (1, 1) and your goal is to reach (m, n). At any instance, if you
 *         are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
 * 
 *         Now consider if some obstacles are added to the grids. How many
 *         unique paths would there be?(Dynamic Programming)
 * 
 *         Input : [[0,0,0],[0,1,0],[0,0,0]]
 *
 *         Output : 2
 *
 */
public class UniquePathsWithObstacle {

	public static void main(String[] args) {
		int[][] a = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println("Unique path with Obstacles : " + uniquePathsO(a));
	}

	private static int uniquePathsO(int[][] a) {
		int width = a[0].length;
		int[] dp = new int[width];
		dp[0] = 1;
		for (int[] row : a) {
			for (int j = 0; j < width; j++) {
				if (row[j] == 1)
					dp[j] = 0;
				else if (j > 0)
					dp[j] += dp[j - 1];
			}
			System.out.println(Arrays.toString(dp));
		}
		return dp[width - 1];
	}

}

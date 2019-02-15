package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a 2D grid of characters and a word, the task is to
 *         check if that word exists in the grid or not. A word can be matched
 *         in 4 directions at any point
 * 
 *         Input : grid[][] = {{ 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, {'A', 'D', 'E', 'E' } } word = "ABCCED"
 *
 *         Output : true
 *
 */
public class WordSearch {
	public static void main(String[] args) {
		char[][] grid = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		boolean res = checkMatch(grid, word, grid.length, grid[0].length);
		System.out.println("Word exists : " + res);
	}

	private static boolean checkMatch(char[][] grid, String word, int m, int n) {
		int l = word.length();
		if (l > m * n) {
			return false;
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == word.charAt(0)) {
					if(findMatch(grid, word, m, n, i, j, 0))
						return true;
				}
			}
		}

		return false;
	}

	private static boolean findMatch(char[][] grid, String word, int row, int column, int x, int y, int level) {
		int l = word.length();
		if (l == level)
			return true;
		if (x < 0 || y < 0 || x >= row || y >= column)
			return false;
		if (grid[x][y] == word.charAt(level)) {
			char temp = grid[x][y];
			grid[x][y] = '#';

			boolean result = findMatch(grid, word, row, column, x - 1, y, level + 1)
					|| findMatch(grid, word, row, column, x + 1, y, level + 1)
					|| findMatch(grid, word, row, column, x, y - 1, level + 1)
					|| findMatch(grid, word, row, column, x, y + 1, level + 1);
			grid[x][y] = temp;
			return result;
		} else
			return false;
	}
}

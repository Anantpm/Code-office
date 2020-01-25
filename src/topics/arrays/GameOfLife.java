package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : According to the Wikipedia's article: "The Game of Life,
 *         also known simply as Life, is a cellular automaton devised by the
 *         British mathematician John Horton Conway in 1970."
 * 
 *         Given a board with m by n cells, each cell has an initial state live
 *         (1) or dead (0). Each cell interacts with its eight neighbors
 *         (horizontal, vertical, diagonal) using the following four rules
 *         (taken from the above Wikipedia article):
 * 
 *         1. Any live cell with fewer than two live neighbors dies, as if caused
 *         by under-population. 
 *         2. Any live cell with two or three live neighbors
 *         lives on to the next generation. 
 *         3. Any live cell with more than three
 *         live neighbors dies, as if by over-population.. 
 *         4. Any dead cell with
 *         exactly three live neighbors becomes a live cell, as if by
 *         reproduction.
 * 
 *         Write a function to compute the next state (after one update) of the
 *         board given its current state. The next state is created by applying
 *         the above rules simultaneously to every cell in the current state,
 *         where births and deaths occur simultaneously. .
 * 
 *         Input : [
 *					  [0,1,0],
 *					  [0,0,1],
 *					  [1,1,1],
 *					  [0,0,0]
					]
 *
 *         Output : [
 *					  [0,0,0],
 *					  [1,0,1],
 *					  [0,1,1],
 *					  [0,1,0]
 *	 				]
 */
public class GameOfLife {
	
	public static void main(String[] args) {
		int[][] a = {  
	            { 0, 1, 0}, 
	            { 0, 0, 1}, 
	            { 1, 1, 1},
	            { 0, 0, 0}
	        }; 
		
		int[][] genNext = getNextGen(a);
		for(int i=0;i<genNext.length;i++)
			System.out.println(Arrays.toString(genNext[i]));
	}

	private static int[][] getNextGen(int[][] a) {
		int M = a.length;
		int N = a[0].length;
		int[][] nextGen = new int[M][N];

		for (int x = 0; x < M ; x++) {
			for (int y = 0; y < N ; y++) {
				int lives = getLives(a, x, y);

				lives -= a[x][y];

				if (a[x][y] == 1 && (lives < 2 || lives > 3))
					nextGen[x][y] = 0;
				else if (a[x][y] == 1 && (lives == 2 || lives == 3))
					nextGen[x][y] = 1;
				else if (a[x][y] == 0 && lives == 3)
					nextGen[x][y] = 1;
				else
					nextGen[x][y] = 0;
			}
		}

		return nextGen;

	}

	private static int getLives(int[][] a, int x, int y) {
		int lives = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int l = x + i;
				int m = y + j;
				if ((l >= 0 && l < a.length) && (m >= 0 && m < a[0].length))
					lives += a[l][m];
			}
		}
		return lives;
	}

}

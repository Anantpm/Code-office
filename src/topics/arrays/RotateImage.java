package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : You are given a n*n 2D matrix representing an image. Rotate
 *         the image by 90 degrees. *
 * 
 *         Input : [[1,2,3],[4,5,6],[7,8,9]]
 *
 *         Output : [[7,4,1],[8,5,2],[9,6,3]];
 *
 */
public class RotateImage {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateImage(a);
	}

	private static void rotateImage(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[0].length; j++) {
				if (i != j)
					swap(a, i, j);
			}
		}
		System.out.println("Transpose : " + Arrays.deepToString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][a.length - 1 - j];
				a[i][a.length - 1 - j] = temp;
			}
		}
		System.out.println("Rotated Image : " + Arrays.deepToString(a));
	}

	private static void swap(int[][] a, int i, int j) {
		int temp = a[i][j];
		a[i][j] = a[j][i];
		a[j][i] = temp;
	}
}

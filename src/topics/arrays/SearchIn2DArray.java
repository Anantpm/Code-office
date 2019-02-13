package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Write an efficient code to search a values in 2D array
 *         which is sorted from left to right
 * 
 *         Input : arr = [[1,3,5,7][10,11,16,20][23,30,34,50]] target = 3
 *
 *         Output : found
 *
 */
public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] a = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int target = 53;
		search(a, target);
	}

	private static void search(int[][] a, int target) {
		int m = a.length;// rows
		int n = a[0].length;// columns
		int i = 0, j = n - 1;
		while (i < m && j >= 0) {
			if (target == a[i][j]) {
				System.out.println("Element found");
				return;
			}
			if (target < a[i][j])
				j--;
			if (target > a[i][j])
				i++;
		}
		System.out.println("Element not found");
	}
}

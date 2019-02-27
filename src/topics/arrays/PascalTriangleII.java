package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an index k, return the kth row of the Pascal's
 *         triangle.
 * 
 *         Input : k = 4
 *
 *         Output : [1,3,3,1]
 *
 */
public class PascalTriangleII {

	public static void main(String[] args) {
		int k = 4;
		printKthRowPascalTri(k);
	}

	private static void printKthRowPascalTri(int k) {
		int C = 1;
		for (int i = 1; i <= k; i++) {
			System.out.print(C + " ");
			C = C * (k - i) / (i);
		}
		System.out.println();
	}

}

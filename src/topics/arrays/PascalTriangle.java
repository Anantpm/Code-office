package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 * Problem : Write a program that takes an integer value n as input and prints first n lines of the Pascal’s triangle 
 *	
 * Input : 7
 *
 * Output : 1 
			1 1 
			1 2 1 
			1 3 3 1 
			1 4 6 4 1 
			1 5 10 10 5 1 
			1 6 15 20 15 6 1
 *
 */
public class PascalTriangle {
	public static void main(String[] args) {
		int n = 10;
		printPascalTriangle(n);
	}

	private static void printPascalTriangle(int n) {
		for (int line = 1; line <= n; line++) {

			int C = 1;
			for (int j = 1; j <= line; j++) {
				System.out.print(C + " ");
				C = C * (line - j) / j;
			}
			System.out.println();

		}
	}
}

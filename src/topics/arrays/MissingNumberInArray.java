package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array containing n distinct numbers taken from 0,
 *         1, 2, ..., n, find the one that is missing from the array.
 * 
 *         Input : [3,0,1]
 *
 *         Output : 2
 *
 */

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] a = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		getMissNo(a);
	}

	private static void getMissNo(int[] a) {
		int n = a.length;
		int sum = n * (n + 1) / 2; // Gauss' formula to calculate sum of continuous numbers
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out.println("Missing Number : " + (sum - total));
	}

}

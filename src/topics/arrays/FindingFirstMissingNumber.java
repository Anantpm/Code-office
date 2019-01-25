package topics.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Find the smallest positive number missing from an unsorted
 *         array.
 * 
 *         Input : [0,10,2,-10,-20]
 *
 *         Output : 1
 *
 */
public class FindingFirstMissingNumber {
	public static void main(String[] args) {
		int[] a = { 2, 3, 7, 6, 8, -1, -10, 15 };
		System.out.println(" # Input Array : "+Arrays.toString(a));
		int missNo = findMissing(a);
		System.out.println("Missing number is : " + missNo);
	}

	private static int findMissing(int[] a) {
		int shift = segregate(a);
		System.out.println("1. Segregated array : "+Arrays.toString(a));
		int[] a1 = new int[a.length - shift];
		int j = 0;
		for (int i = shift; i < a.length; i++) {
			a1[j] = a[i];
			j++;
		}
		System.out.println("2. Only positive number's array : "+Arrays.toString(a1));
		return findMissingPositive(a1, j);
	}

	private static int findMissingPositive(int[] a1, int size) {
		for (int i = 0; i < a1.length; i++) {
			int x = Math.abs(a1[i]);
			if (x - 1 < size && a1[x - 1] > 0)
				a1[x - 1] = -a1[x - 1];
		}
		System.out.println("3. Marked the visited elements as -ve : "+Arrays.toString(a1)+" size : "+size);

		for (int j = 0; j < a1.length; j++) {
			if (a1[j] > 0) {
				return j+1;
			}
		}
		return size+1;
	}

	private static int segregate(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		return j;

	}
}

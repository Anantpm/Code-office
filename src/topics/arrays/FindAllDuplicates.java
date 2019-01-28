package topics.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of n elements which contains elements from 0
 *         to n-1, with any of these numbers appearing any number of times. Find
 *         these repeating numbers in O(n) and using only constant memory space.
 * 
 *         Input : [1, 2, 3, 1, 3, 6, 6] and n =7
 *
 *         Output : 1,3,6
 *
 */
public class FindAllDuplicates {
	public static void main(String[] args) {
		int[] a = { 1, 6, 3, 1, 3, 6, 6 };
//		findAllDups(a);
		findDuplicates(a);
	}

	private static void findDuplicates(int[] a) {
		IntStream.range(0, a.length).forEach(i -> {
			a[a[i] % a.length] += a.length;
		});

		System.out.println("Input array: " + Arrays.toString(a));

		IntStream.range(0, a.length).filter(i -> a[i] / a.length != 0).forEach(i -> System.out.print(i + ", "));

	}

	// There is a problem in below approach. It prints the repeated number more than
	// once. For example: {1, 6, 3, 1, 3, 6, 6} it will give output as : 1 3 6 6
	private static void findAllDups(int[] a) {
		IntStream.range(0, a.length).forEach(i -> {
			int x = Math.abs(a[i]);
			if (a[x - 1] > 0)
				a[x - 1] = -a[x - 1];
			else
				System.out.print(x + ", ");
		});
	}
}

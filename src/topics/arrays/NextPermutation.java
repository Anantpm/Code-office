package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Implement the next permutation, which rearranges numbers
 *         into the numerically next greater permutation of numbers. If such
 *         arrangement is not possible, it must be rearranged as the lowest
 *         possible order i.e., sorted in an ascending order
 * 
 *         input : 1,2,3
 *
 *         output : 1,3,2
 *
 */
public class NextPermutation {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 5, 4, 3, 3, 2, 1 };
//		int[] a = { 1, 2, 3 };
//		int[] a = { 3, 2, 1 };
//		int[] a = {4,9,4,7,6,9,1,3,0};
		System.out.print("Input number :");
		Arrays.stream(a).forEach(System.out::print);
		nextPerm(a);
	}

	private static void nextPerm(int[] a) {
		int i = a.length - 1;
		while (i != 0 && a[i - 1] >= a[i]) {
			i--;
		}
		if (i != 0) {
			int k = a.length - 1;
			while (a[k] <= a[i - 1])
				k--;
			swap(a, (i - 1), k);
		}
		int j = a.length - 1;
		while (i < j) {
			swap(a, i, j);
			i++;
			j--;
		}
		System.out.println();
		System.out.print("Next greater number :");
		Arrays.stream(a).forEach(System.out::print);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
}

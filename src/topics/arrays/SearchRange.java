package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of integers sorted in ascending order, find
 *         the starting and ending position of a given target value
 * 
 *         input : [5,7,7,8,8,10] and 8
 *
 *         output : [3,4]
 *
 */
public class SearchRange {
	public static void main(String[] args) {
		int[] a = { 5, 7, 7, 8, 8, 10 };
		int num = 8;
		int[] range = searchRange(a, num);
		System.out.println(Arrays.toString(range));
		int first = first(a, 0, a.length - 1, num);
		int last = last(a, 0, a.length - 1, num);
		range = new int[] { first, last };
		System.out.println(Arrays.toString(range));
	}

	// Time complexity is O(log n)
	private static int first(int[] a, int low, int high, int num) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if ((mid == 0 || num > a[mid - 1]) && a[mid] == num)
			return mid;
		else if (a[mid] < num)
			return first(a, mid + 1, high, num);
		return first(a, low, mid - 1, num);
	}

	private static int last(int[] a, int low, int high, int num) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if ((mid == a.length - 1 || num < a[mid + 1]) && a[mid] == num)
			return mid;
		else if (a[mid] < num)
			return last(a, mid + 1, high, num);
		return last(a, low, mid - 1, num);
	}

	// Time Complexity O(n)
	private static int[] searchRange(int[] a, int num) {
		int[] range;
		int first = -1, last = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != num)
				continue;
			if (first == -1)
				first = i;
			last = i;
		}
		range = new int[] { first, last };
		return range;
	}

}

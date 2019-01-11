
package topics.arrays;

import java.util.Arrays;

/*
 * @author manjulkar_a Problem : Remove duplicate from a sorted array and return the new length 
 * Input : [1,1,2] 
 * Output : 2
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = removeDups(a, a.length);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = a[i];
		}
		System.out.println("New array with no duplicates : " + Arrays.toString(arr));
	}

	private static int removeDups(int[] a, int length) {
		if (length == 0)
			return 0;
		int slow = 0;
		for (int fast = 1; fast < length; fast++) {
			if (a[fast] != a[slow])
				a[++slow] = a[fast];
		}
		return ++slow;
	}

}

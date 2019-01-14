package topics.arrays;

import java.util.Arrays;

/**
 * @author : Anant Manjulkar
 *
 * Problem : Remove multiple occurrences of element from the array.
 *	
 * input : {3,2,3,2} and number to be removed : 3
 *
 * output : 2
 *
 */
public class RemoveSpecifiedElement {

	public static void main(String[] args) {
		int[] a = { 3, 2, 2, 3 };
		int len = removeElement(a, 3);
		System.out.println(len);
	}

	private static int removeElement(int[] a, int num) {
		if (a.length == 0)
			return 0;
		int slow = 0;
		for (int fast = 0; fast < a.length; fast++) {
			if (a[fast] != num)
				a[slow++] = a[fast];
		}
//		Arrays.stream(a).forEach(System.out::println);
		return slow;
	}

}


package topics.arrays;

import java.util.Arrays;

/**
 * @author manjulkar_a 
 * Problem : One number out of all continuous numbers is
 *         duplicated within the array find the number.
 */
public class FindDuplicate {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3 };
		findDup(a);
	}

	private static void findDup(int[] a) {
		int sum = Arrays.stream(a).sum();
		int total = a[a.length - 1] * (a[a.length - 1] + 1) / 2;
		System.out.println("Duplicate no = " + (sum - total));
	}

}

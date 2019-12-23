package topics.arrays;

/**
 * @author Anant Manjulkar
 * 
 *         Problem : Write a function which takes an array and prints the
 *         majority element (which always exists), otherwise prints “No Majority
 *         Element”. A majority element in an array A[] of size n is an element
 *         that appears more than n/2 times (and hence there is at most one such
 *         element).
 * 
 *         Input : [3, 3, 4, 2, 4, 4, 2, 4, 4]
 *
 *         Output : 4
 * 
 *
 */

public class MajorityElement {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		getMajorityElement(a);
	}

	private static void getMajorityElement(int[] a) {
		int major = a[0];
		int count = 1;
		for (int i = 1; i < a.length; i++) {
			if (count == 0) {
				count++;
				major = a[i];
			} else if (major == a[i])
				count++;
			else
				count--;
		}
		System.out.println("Majority Element : " + major);
	}

}

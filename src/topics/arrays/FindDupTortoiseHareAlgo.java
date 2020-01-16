package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *  		Floyd's Tortoise and Hare (Cycle Detection)
 *
 *         Problem : Given an array nums containing n + 1 integers where each
 *         integer is between 1 and n (inclusive), prove that at least one
 *         duplicate number must exist. Assume that there is only one duplicate
 *         number, find the duplicate one.
 *         
 *         Constraints : 
 * 			    1. You must not modify the array (assume the array is read only).
 *			    2. You must use only constant, O(1) extra space.
 *		    	3. Your runtime complexity should be less than O(n2).
 *		    	4. There is only one duplicate number in the array, but it could be repeated more than once.
 *
 * 
 *         Input : [1,3,4,2,2]
 *
 *         Output : 2
 */

public class FindDupTortoiseHareAlgo {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 2, 2 };
		findCycle(a);
	}

	private static void findCycle(int[] a) {
		int n = a.length;
		int slow = n;
		int fast = n;

		// Find the intersection point of the two runners

		do {
			slow = a[slow - 1];
			fast = a[a[fast - 1] - 1];
		} while (slow != fast);

		slow = n;

		while (slow != fast) {
			slow = a[slow - 1];
			fast = a[fast - 1];
		}

		System.out.println("Duplicate Number : " + slow);
	}

}

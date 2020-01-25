package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an unsorted array return whether an increasing
 *         subsequence of length 3 exists or not in the array.
 * 
 *         Input : [1,2,3,4,5]
 *
 *         Output : true
 */

public class TripletSequence {

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		boolean isTriplet = isTriplet(a);
		System.out.println(isTriplet);
	}

	private static boolean isTriplet(int[] a) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
			else if (max < a[i])
				max = a[i];
			else
				return true;

		}
		return false;
	}

}

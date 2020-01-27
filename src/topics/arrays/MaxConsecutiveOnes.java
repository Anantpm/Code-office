package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a binary array, find the maximum number of
 *         consecutive 1s in this array.
 * 
 * 
 *         Input : [1,1,0,1,1,1]
 *
 *         Output : 3
 */

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] a = { 1, 1, 0, 1, 1, 1 };
		getMaxConOnes(a);
	}

	private static void getMaxConOnes(int[] a) {
		int maxCount = 0;
		int count = 0;
		for (int n : a) {
			if (n == 1)
				count++;
			else
				count = 0;
			if (maxCount < count)
				maxCount = count;
		}
		System.out.println("Max consecutive one count = "+maxCount);
	}

}

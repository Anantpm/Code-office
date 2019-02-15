package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Remove duplicates from array but duplicates are allowed
 *         atmost twice
 * 
 *         Input : [1,1,1,2,2,3]
 *
 *         Output : count = 5
 *
 */
public class RemoveDupsAtmostTwice {
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 3 };
		int cnt = removeDups(a);
		System.out.println("count = " + cnt);
	}

	private static int removeDups(int[] a) {
		int count = 0;
		for (int n : a) {
			if (count < 2 || n > a[count - 2])
				a[count++] = n;
		}
		return count;
	}
}

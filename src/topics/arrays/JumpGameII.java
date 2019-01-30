package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of integers where each element represents
 *         the max number of steps that can be made forward from that element.
 *         Write a function to return the minimum number of jumps to reach the
 *         end of the array (starting from the first element)
 * 
 *         Input : arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 *
 *         Output : 3 (1-> 3 -> 8 -> 9)
 *
 */
public class JumpGameII {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int jumps = jump(a);
		System.out.println("Minimum jumps are :" + jumps);
	}

	private static int jump(int[] a) {
		int lastReach = 0;
		int reach = 0;
		int step = 0;
		for (int i = 0; i <= reach && i < a.length; i++) {
			if (i > lastReach) {
				step++;
				lastReach = reach;
			}
			reach = Math.max(reach, i + a[i]);
		}
		if (reach < a.length - 1)
			return 0;
		return step;
	}

}

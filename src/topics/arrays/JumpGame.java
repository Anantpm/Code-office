package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of non-negative integers, you are initially
 *         positioned at the first index of the array. Each element in the array
 *         represents your maximum jump length at that position. Determine if
 *         you are able to reach the last index
 * 
 *         Input : A = [2,3,1,1,4] , A = [3,2,1,0,4]
 *
 *         Output : true , false
 *
 */
public class JumpGame {

	public static void main(String[] args) {
		int[] A = { 3, 2, 1, 0, 4 };
		boolean ans = canJump(A);
		System.out.println("We can jump till end : " + ans);
	}

	private static boolean canJump(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max <= i && a[i] == 0)
				return false;
			if (i + a[i] > max)
				max = i + a[i];
			if (max >= a.length)
				return true;
		}
		return false;
	}

}

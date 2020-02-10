package topics.arrays;

import java.util.Random;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given an array of integers with possible duplicates,
 *         randomly output the index of a given target number. You can assume
 *         that the given target number must exist in the array.
 * 
 *         int[] nums = new int[] {1,2,3,3,3}; 
 *         Solution solution = new Solution(nums);
 * 
 *         // pick(3) should return either index 2, 3, or 4 randomly. Each index
 *         should have equal probability of returning. solution.pick(3);
 * 
 *         // pick(1) should return 0. Since in the array only nums[0] is equal
 *         to 1. solution.pick(1);
 **/

public class RandomPickIndex {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,3,3};
		Sol s = new Sol(nums);
		System.out.println(s.pick(1));
		System.out.println(s.pick(3));
	}

}

class Sol {
	private int[] a;
	private Random rand;

	public Sol(int[] a) {
		this.a = a;
		rand = new Random();
	}

	public int pick(int num) {
		int result = -1;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != num)
				continue;
			if (rand.nextInt(++count) == 0)
				result = i;
		}
		return result;
	}

}

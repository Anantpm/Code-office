package topics.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Shuffle a set of numbers without duplicates.
 * 
 *         // Init an array with set 1, 2, and 3. int[] nums = {1,2,3}; Solution
 *         solution = new Solution(nums);
 * 
 *         // Shuffle the array [1,2,3] and return its result. Any permutation
 *         of [1,2,3] must equally likely to be returned. 
 *         solution.shuffle();
 * 
 *         // Resets the array back to its original configuration [1,2,3].
 *         solution.reset();
 * 
 *         // Returns the random shuffling of array [1,2,3]. 
 *         solution.shuffle();
 */

public class ShuffleArray {

	public static void main(String[] args) {
		int[] a  = {1,2,3,4};
		Solution s = new Solution(a);
		
		System.out.println(Arrays.toString(s.shuffle()));
		System.out.println(Arrays.toString(s.reset()));
		System.out.println(Arrays.toString(s.shuffle()));

	}

}

class Solution{
	private int[] nums;
	private Random rand;
	
	Solution(int[] nums){
		this.nums = nums;
		rand = new Random();
	}
	
	public int[] reset() {
		return nums;
	}
	
	public int[] shuffle() {
		if(nums == null)
			return null;
		int[] a = nums.clone();
		for(int i=0;i<a.length;i++) {
			int j = rand.nextInt(a.length);
			swap(a,j,i);
		}
		
		return a;
	}

	private void swap(int[] a, int j, int i) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	
}

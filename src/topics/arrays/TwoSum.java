/*
 * Given an array of Integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * Input: {2,7,11,15}, Target : 9
 * 
 * Output: [0,1]  
 */
package topics.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = { 2, 7, 11, 15 };
		int target = 9;
		getPair(a, target);
		getPair8(a, target);
	}

	/*
	 * implementation using java 8 stream api.
	 * 
	 */
	private static void getPair8(int[] a, int target) {
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		IntStream.range(0, a.length).forEach(i -> {
			if (map.containsKey(target - a[i])) {
				{
					arr[0] = map.get(target - a[i]);
					arr[1] = i;
				}
			} else {
				map.put(a[i], i);
			}
		});
		Arrays.stream(arr).forEach(System.out::println);
	}

	private static void getPair(int[] a, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int arr[] = new int[2];
		for (int i = 0; i < a.length; i++) {
			Integer val = map.get(target - a[i]);
			if (val == null) {
				map.put(a[i], i);
			} else {
				arr[0] = val;
				arr[1] = i;
			}
		}
//		System.out.println(map);
		System.out.println(Arrays.toString(arr));
	}

}

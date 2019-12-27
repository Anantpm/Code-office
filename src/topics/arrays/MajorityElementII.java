package topics.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anant Manjulkar
 * 
 *         Problem : Given an integer array of size n, find all elements that
 *         appear more than n/3 times.
 * 
 *         Input : [1,1,1,3,3,2,2,2]
 *
 *         Output : [1,2]
 * 
 *
 */

public class MajorityElementII {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 3, 3, 2, 2, 2 };
		List<Integer> list = findMajorityElements(a);
		System.out.println("Majority Elements with n/3 = " + (a.length / 3) + " occurrences : " + list);
	}

	private static List<Integer> findMajorityElements(int[] a) {
		List<Integer> list = new ArrayList<Integer>();

//		1. Find majority elements first
		int number1 = a[0];
		int number2 = a[0];
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < a.length; i++) {
			if (number1 == a[i])
				count1++;
			else if (number2 == a[i])
				count2++;
			else if (count1 == 0) {
				number1 = a[i];
				count1 = 1;
			} else if (count2 == 0) {
				number2 = a[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;

//		2. Count the occurrences of the majority elements
		for (int i = 0; i < a.length; i++) {
			if (number1 == a[i])
				count1++;
			else if (number2 == a[i])
				count2++;
		}

//		3. Now add them to result
		if (count1 > a.length / 3)
			list.add(number1);
		if (count2 > a.length / 3)
			list.add(number2);

		return list;
	}

}

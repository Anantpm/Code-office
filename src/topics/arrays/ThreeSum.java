/*
 * Problem : find all unique triplets in the array which gives the sum of zero;
 * Input : { -1, 0, 1, 2, -1 };
 * Output : [
 * 				[-1,-1,2];
 * 				[-1,0,1];	
 * 			]  
 * 
 */
package topics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] a = { -1, 0, 1, 2, -1 };
		int b[] = { 1, 4, 45, 6, 10, 8 };
		pairOf3Num(a, a.length);
	}

	private static void pairOf3Num(int[] a, int length) {
		Arrays.sort(a);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < length - 1; i++) {
			int l = i + 1;
			int r = length - 1;
			while (l < r) {
				int sum = a[i] + a[l] + a[r];
				if (sum == 0) {
					list.add(Arrays.asList(a[i], a[l], a[r]));
					while (l < r && a[l] == a[l + 1])
						l++;
					while (l < r && a[r] == a[r - 1])
						r--;
					l++;
					r--;
				}
				if (sum < 0)
					l++;
				else
					r--;

			}
		}
		System.out.println("Zero pair : " + list);
	}

}

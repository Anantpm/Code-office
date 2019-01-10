/*
 * Problem : Given n non-negative integers a1,a2,... an, where each represents a point at coordinate (i,ai). n vertical lines are drawn such that
 * the two endpoints of line i is at (i, ai) and (i,0). Find two lines which together with x-axis forms a container, such that the container contains 
 * the most water.
 * Input : [1, 5, 4, 3]
 * Output : 6
 * Explanation : 
	5 and 3 are distance 2 apart. 
	So the size of the base = 2. 
	Height of container = min(5, 3) = 3. 
	So total area = 3 * 2 = 6
 * 
 */
package topics.arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] a = { 1, 5, 4, 3 };
		int[] b = { 3, 1, 2, 4, 5 };
		maxArea(a, a.length);
		maxArea(b, b.length);
	}

	private static void maxArea(int[] a, int length) {
		int l = 0;
		int r = length - 1;
		int area = 0;
		while (l < r) {
			area = Math.max(area, Math.min(a[l], a[r]) * (r - l));
			if (a[l] < a[r])
				l++;
			else
				r--;
		}
		System.out.println("Most water in the container = " + area);
	}

}

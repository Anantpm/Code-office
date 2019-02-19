package topics.arrays;

import java.util.Stack;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Find the largest rectangular area possible in a given
 *         histogram where the largest rectangle can be made of a number of
 *         contiguous bars. For simplicity, assume that all bars have same width
 *         and the width is 1 unit.
 * 
 *         Input : {6, 2, 5, 4, 5, 1, 6}
 *
 *         Output : 12
 *
 */
public class LargestRectangleInhistogram {
	public static void main(String[] args) {
		int[] a = { 6, 2, 5, 4, 5, 1, 6 };
		System.out.println("Maximum area is : " + getMaxRectangularArea(a));
	}

	private static int getMaxRectangularArea(int[] a) {
		int maxArea = 0;
		Stack<Integer> stack = new Stack<>();
		int areaTop;
		int tp;
		int i = 0;
		while (i < a.length) {
			if (stack.empty() || a[stack.peek()] <= a[i])
				stack.push(i++);
			else {
				tp = stack.pop();
				areaTop = a[tp] * (stack.empty() ? i : i - stack.peek() - 1);
				if (maxArea <= areaTop) {
					maxArea = areaTop;
				}
			}
		}
		while (!stack.empty()) {
			tp = stack.pop();
			areaTop = a[tp] * (stack.empty() ? i : i - stack.peek() - 1);
			if (maxArea <= areaTop) {
				maxArea = areaTop;
			}
		}
		return maxArea;
	}
}

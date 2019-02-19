package topics.arrays;

import java.util.Stack;

/**
 * @author : Anant Manjulkar
 *
 * Problem :  Given a binary matrix, find the maximum rectangle binary-sub-matrix with all 1’s and return it's area. 
 *	
 * Input : 0 1 1 0
 *         1 1 1 1
 *         1 1 1 1
 *         1 1 0 0
 *
 * Output : 6
 *
 */
public class MaximalRectangle {
	public static void main(String[] args) {
		int[][] a = {{0, 1, 1, 0}, 
                	 {1, 1, 1, 1}, 
                	 {1, 1, 1, 1}, 
                	 {1, 1, 0, 0}};
		System.out.println("Maximum rectangular area = "+getMaxRectangleArea(a));
	}

	private static int getMaxRectangleArea(int[][] a) {
		if (a == null || a.length == 0 || a[0].length == 0)
			return 0;
		int maxArea = maxHist(a[0]);
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 1)
					a[i][j] += a[i - 1][j];
				maxArea = Math.max(maxArea, maxHist(a[i]));
			}
		}
		return maxArea;
	}

	private static int maxHist(int[] row) {
		int area = 0;
		Stack<Integer> stack = new Stack<>();
		int tp;
		int areaTop;
		int i = 0;
		while (i < row.length) {
			if (stack.empty() || row[i] >= row[stack.peek()])
				stack.push(i++);
			else {
				tp = stack.pop();
				areaTop = row[tp] * (stack.empty() ? i : (i - stack.peek() - 1));
				if (area < areaTop)
					area = areaTop;
			}
		}

		while (!stack.empty()) {
			tp = stack.pop();
			areaTop = row[tp] * (stack.empty() ? i : (i - stack.peek() - 1));
			if (area < areaTop)
				area = areaTop;
		}
		
		return area;
	}
}

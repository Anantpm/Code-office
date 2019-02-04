package topics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a set of time intervals in any order, merge all
 *         overlapping intervals into one and output the result which should
 *         have only mutually exclusive intervals. Let the intervals be
 *         represented as pairs of integers for simplicity.
 * 
 *         Input : [{1,3}, {2,4}, {5,7}, {6,8} ]
 *
 *         Output : [{1,4},{5,8}]
 *
 */
public class MergeIntervals {
	public static void main(String[] args) {
		Interval[] a = new Interval[4];
		a[0] = new Interval(1, 3);
		a[1] = new Interval(2, 4);
		a[2] = new Interval(6, 8);
		a[3] = new Interval(5, 7);
		System.out.println(mergeIntervals(a));
	}

	private static List<Interval> mergeIntervals(Interval[] a) {
		int[] start = new int[a.length];
		int[] end = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			start[i] = a[i].getStart();
			end[i] = a[i].getEnd();
		}

		Arrays.sort(start);
		Arrays.sort(end);

		List<Interval> list = new ArrayList<>();
		for (int i = 0, j = 0; i < a.length; i++) {
			if (i == a.length - 1 || start[i + 1] > end[i]) {
				list.add(new Interval(start[j], end[i]));
				j = i + 1;
			}
		}
		return list;
	}
}

class Interval {
	private int start;
	private int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "[" + this.start + "," + this.end + "]";
	}
}

package topics.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a set of non-overlapping intervals and a new
 *         interval, insert the interval at correct position. If the insertion
 *         results in overlapping intervals, then merge the overlapping
 *         intervals. Assume that the set of non-overlapping intervals is sorted
 *         on the basis of start time, to find correct position of insertion
 * 
 *         Input : Set : [1, 3], [6, 9] , New Interval : [2, 5]
 *
 *         Output : [1, 5], [6, 9]
 *
 */
public class InsertAndMergeInterval {
	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1, 2));
		list.add(new Interval(3, 5));
		list.add(new Interval(6, 7));
		list.add(new Interval(8, 10));
		list.add(new Interval(12, 16));

		System.out.println("Result : " + insertMerge(list, new Interval(4, 9)));

	}

	private static List<Interval> insertMerge(List<Interval> list, Interval interval) {
		List<Interval> result = new ArrayList<>();

		for (Interval itrl : list) {
			if (itrl.getEnd() < interval.getStart())
				result.add(itrl);
			else if (itrl.getStart() > interval.getEnd()) {
				result.add(interval);
				interval = itrl;
			} else if (itrl.getEnd() >= interval.getStart() || itrl.getStart() <= interval.getEnd()) {
				interval = new Interval(Math.min(itrl.getStart(), interval.getStart()),
						Math.max(itrl.getEnd(), interval.getEnd()));
			}
		}
		result.add(interval);

		return result;
	}
}

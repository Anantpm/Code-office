package topics.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anant Manjulkar
 * 
 *         Problem : Given a sorted integer array without duplicates, return the
 *         summary of its ranges.
 * 
 *         Input : [0,1,2,4,5,7]
 * 
 *         Output : ["0->2","4->5","7"]
 *
 */
public class SummaryRanges {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 4, 8, 9 };
		List<String> result = getSummaryRanges(a);
		System.out.println("Ranges are : " + result);

	}

	private static List<String> getSummaryRanges(int[] a) {
		List<String> list = new ArrayList<String>();
		if (a == null || a.length == 0)
			return list;
		for (int i = 0; i < a.length; i++) {
			int start = a[i];
			while (i + 1 < a.length && (a[i + 1] - a[i]) == 1)
				i++;
			if (start != a[i])
				list.add(start + "->" + a[i]);
			else
				list.add(start + "");
		}
		return list;
	}

}

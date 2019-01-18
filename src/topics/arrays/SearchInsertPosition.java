package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Given a sorted array and a target value, return the index
 *         if the target is found. If not return the index where it would be if
 *         it were inserted.
 * 
 *         Input : [1,3,5,6] and 5
 *
 *         Output : 2
 *
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 6 };
		int num = 7;
		int index = searchIndex(a, num);
		System.out.println("Insertion index = " + index);
	}

	private static int searchIndex(int[] a, int num) {
		int low = 0, high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (num == a[mid])
				return mid;
			if (num < a[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

}

package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Search an element in a sorted array but rotated around some
 *         pivot.
 * 
 *         Input : [4,5,6,7,0,1,2,3] and 6
 *
 *         Output : element found
 *
 */
public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int num = 3;
		int index = search(a,num);
		System.out.println(index);
	}

	private static int search(int[] a, int num) {
		int i = 0;
		int j = a.length-1;
		while(i<j && a[i]>a[j]) {
			++i;
			--j;
		}
		System.out.println(a[i]+" "+a[j]);
		if(num >=a[0] && num <=a[j])
			 return bsearch(a,num,0,j);
		return bsearch(a, num, i, a.length-1);
	}

	private static int bsearch(int[] a, int num, int low, int high) {
		if(low > high)
			return -1;
		int mid  = (low +high) /2;
		if(num == a[mid])
			return mid;
		if(num < a[mid]) 
			return bsearch(a, num, low, mid-1);
		return bsearch(a, num, mid+1, high);
	}
}

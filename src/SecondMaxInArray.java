/*
 * Second Highest In An Array
 */
public class SecondMaxInArray {
	public static void main(String[] args) {
		int[] a = { 8, 6, 4, 7, 2, 1 };
		getSecondMax(a);
	}

	private static void getSecondMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				secMax = max;
				max = a[i];
			} else if(a[i] > secMax && a[i] != max){
				secMax = a[i];
			}
		}
		if(secMax == Integer.MIN_VALUE)
			System.out.println("There is no second largest in the array");
		else
			System.out.println("Second Max In Array is : " + secMax);
	}
}

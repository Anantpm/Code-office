package searchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = { 11, 22, 33, 44, 88, 50, 12 };
		linearSearch(a,12);
	}

	private static void linearSearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) 
		{
			if(n == a[i]) {
				System.out.println(n+" found at position : "+(i+1));
				return;
			}
		}
		System.out.println(n+" not found");
	}
}

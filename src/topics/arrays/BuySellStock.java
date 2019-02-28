package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Say you have an array for which the ith element is the
 *         price of stock on day i. Find the max profit that you can make by
 *         buying and selling in those days
 * 
 *         Input : [7,1,5,3,6,4]
 *
 *         Output : 5
 *
 */
public class BuySellStock {
	public static void main(String[] args) {

		int[] price = { 7, 1, 5, 3, 6, 4 };
		findMaxProfitFromStock(price);
	}

	private static void findMaxProfitFromStock(int[] price) {
		int currMax = 0;
		int maxSoFar = 0;
		for (int i = 1; i < price.length; i++) {
			currMax = Math.max(0, currMax + price[i] - price[i - 1]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		System.out.println("Maximum profit = " + maxSoFar);
	}
}

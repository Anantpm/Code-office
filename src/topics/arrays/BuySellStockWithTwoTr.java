package topics.arrays;

/**
 * @author : Anant Manjulkar
 *
 *         Problem : Say you have an array for which the ith element is the
 *         price of a given stock on day i.
 * 
 *         Design an algorithm to find the maximum profit. You may complete at
 *         most two transactions.
 * 
 *         Note: You may not engage in multiple transactions at the same time
 *         (i.e., you must sell the stock before you buy again).
 * 
 *         Input : [3,3,5,0,0,3,1,4]
 *
 *         Output : 6
 * 
 *         Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3),
 *         profit = 3-0 = 3. Then buy on day 7 (price = 1) and sell on day 8
 *         (price = 4), profit = 4-1 = 3.
 *
 */
public class BuySellStockWithTwoTr {
	public static void main(String[] args) {
		int[] price = { 3, 3, 5, 0, 0, 3, 1, 4 };
		getMaxProfitByTwoTr(price);
	}

	private static void getMaxProfitByTwoTr(int[] price) {
		int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
		int release1 = 0, release2 = 0;
		for (int i : price) {
			release2 = Math.max(release2, hold2 + i);
			hold2 = Math.max(hold2, release1 - i);
			release1 = Math.max(release1, hold1 + i);
			hold1 = Math.max(hold1, -i);
		}
		System.out.println("Maximum Profit = " + release2);
	}
}

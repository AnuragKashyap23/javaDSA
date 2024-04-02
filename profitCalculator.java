/*
Write a java program for following:  Maximum Profit on App Sales
In an online app marketplace, each app's price Fluctuates daily. You're given the prices of an app for the next N days and are tasked with buying and selling the app to maximize your profit. You can only 
make one transaction (buy once and sell once), and you must buy before you can sell. Write a Java function, maxProfit, that calculates the maximum profit you can achieve.

Condition:
• You may not engage in multiple transactions at the same time (you must sell the app before buying again).
If no profit is possible, return 0.
*/
public class profitCalculator {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0]; // Start with the first day's price

        // Loop through all prices starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // If the current price is less than the minimum price, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Calculate the profit if sold at the current price
                int profit = prices[i] - minPrice;
                // Update maxProfit if the current profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit for prices1: " + maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum profit for prices2: " + maxProfit(prices2)); // Output: 0
    }
}

package com.arrays;

import java.util.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {2, 1, 5, 3, 6, 4};
        System.out.println("Given nums: " + Arrays.toString(prices));
        int result = maxProfit(prices);
        System.out.println("MaxProfit is: " + result);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}

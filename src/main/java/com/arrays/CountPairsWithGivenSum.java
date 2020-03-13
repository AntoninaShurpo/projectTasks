package com.arrays;

import java.util.Arrays;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        System.out.println("Given nums: " + Arrays.toString(nums));
        int sum = 6;
        System.out.println("Given sum: " + sum);
        getPairsCount(nums, sum);
    }

    public static void getPairsCount(int[] nums, int sum) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    count++;

                }
            }
        }
        System.out.printf("Count of pairs: " + count);
    }



}

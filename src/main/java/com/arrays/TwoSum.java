package com.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println("Given array: " + Arrays.toString(nums));

        int target = 9;
        twoSum(nums, target);

    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.print("Result: [" + i + " ," + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No results");
    }
}

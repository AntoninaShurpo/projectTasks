package com.arrays;

import java.util.Arrays;

public class Subtraction {
    public static void main(String[] args) {
        int[] nums = {3, 6, 4, 2, 5, 1, -2, 0};
        System.out.println("Given nums: " + Arrays.toString(nums));
        int key = 5;
        System.out.println("Subtraction: key = " + key);
        int result = 0;
        operations(nums, key, result);
    }

    public static int operations(int[] nums, int k, int result) {
        System.out.print("Result: ");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                result = nums[i] - k;
            } else {
                result = k - nums[i];
            }
            //result = Math.abs(Math.abs(nums[i]) - k);
            System.out.print(result + " ");
        }
        return result;
    }

}

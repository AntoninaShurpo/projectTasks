package com.arrays;

import java.util.Arrays;

public class SubtractionEven {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, -4, 5, 0};
        System.out.println("Given nums: " + Arrays.toString(nums));
        int key = 7;
        System.out.println("Subtraction: key =" + key);
        int result = 0;
        operation(nums, key, result);
    }

    public static int operation(int[] nums, int key, int result) {
        System.out.print("Result: ");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result = Math.abs(nums[i] - key);
            } else {
                result = nums[i];
            }
            System.out.print(result + " ");
        }
        return result;
    }

}

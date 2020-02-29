package com.arrays;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Given array: " + Arrays.toString(nums));
        int[] result = rotated(nums);
        System.out.println("Rotated result: " + Arrays.toString(result));
    }

    public static int[] rotated(int[] nums) {
        int k = 3;
        int temp;
        int previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        return nums;
    }
}



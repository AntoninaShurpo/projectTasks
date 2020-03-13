package com.arrays;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 1, 8};
        System.out.println("Given array: " + Arrays.toString(nums));
        findMax(nums);

    }

    public static void findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {

            max = Math.max(max, nums[i]);
        }
        System.out.println("Max value in given array: " + max);

    }
}

/* Arrays.sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
        System.out.println("Min value is " + nums[0]);
        System.out.println("Max value is " + nums.length);*/

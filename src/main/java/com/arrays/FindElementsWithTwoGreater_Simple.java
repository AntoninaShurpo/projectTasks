package com.arrays;

import java.util.Arrays;

public class FindElementsWithTwoGreater_Simple {
    public static void main(String[] args) {
        int[] nums = {2, -6, 3, 5, 1};
        System.out.println("Given nums: " + Arrays.toString(nums));
        int n = nums.length;
        findElements(nums, n);
    }

    public static void findElements(int nums[], int n) {
        System.out.println("Result: ");

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] > nums[i]) {
                    count++;
                }
            }

            if (count >= 2) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}

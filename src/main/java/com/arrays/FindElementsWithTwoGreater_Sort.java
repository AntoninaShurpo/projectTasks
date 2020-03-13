package com.arrays;

import java.util.Arrays;

public class FindElementsWithTwoGreater_Sort {
    public static void main(String[] args) {
        int[] nums = {2, -6, 3, 5, 1};
        System.out.println("Given nums: " + Arrays.toString(nums));
        int n = nums.length;
        findElements(nums, n);
    }

    public static void findElements(int[] nums, int n) {
        Arrays.sort(nums); // {-6, 1, 2, 3, 5}
        System.out.println("Result: ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

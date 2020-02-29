package com.arrays;

import java.util.Arrays;

public class UnsortedContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {5, 8, 2, 3, 5};
        System.out.println("Given array: " + Arrays.toString(nums));
        boolean result = containsDuplicates(nums);
        System.out.println("Is unsorted array contains duplicates: " + result);
    }

    public static boolean containsDuplicates(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}


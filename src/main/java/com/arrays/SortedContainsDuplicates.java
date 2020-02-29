package com.arrays;

import java.util.Arrays;

public class SortedContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4, 7};
        System.out.println("Given array: " + Arrays.toString(nums));
        boolean result = containsDuplicate(nums);
        System.out.println("Is array contains duplicates: " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}

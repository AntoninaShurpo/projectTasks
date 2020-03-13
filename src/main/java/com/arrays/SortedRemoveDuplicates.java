package com.arrays;

import java.util.Arrays;

public class SortedRemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 4, 5, 6};
        System.out.println("Given array: " + Arrays.toString(nums));
        int[] result = removeDuplicates(nums);
        System.out.println("Array, after removing the duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] nums) {
       // if (nums.length == 0) ;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

}



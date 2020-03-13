package com.arrays;

import java.util.Arrays;

public class LargestSumContiguousArray {
    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Givem nums is: " + Arrays.toString(nums));
        System.out.println("Maximum contiguous sum is " + maxSum(nums));
    }

    public static int maxSum(int[] nums) {
        int size = nums.length;
        int max_so_far = 0; //Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }

}

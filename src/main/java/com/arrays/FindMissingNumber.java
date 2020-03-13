package com.arrays;

import java.util.Arrays;

public  class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2,3, 4, 5, 7, 8, 9, 10};
        System.out.println("Given nums is " + Arrays.toString(nums));
        int result = missingNumber(nums, 10);
        System.out.println("Missing number is "+ result);
    }

    public static int missingNumber(int[] nums, int size) {
        int Sum = 0;
        int Sum_N;
        Sum_N = size * (size + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            Sum = Sum + nums[i];
        }
        return Sum_N- Sum;

    }
}

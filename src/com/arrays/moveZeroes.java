package com.arrays;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Given array: " + "\n" + Arrays.toString(nums));
        int n = nums.length;
        moveZeroes(nums, n);
        System.out.println("Array to output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveZeroes(int[] nums, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while (count < n) {
            nums[count] = 0;
            count++;
        }

    }
}

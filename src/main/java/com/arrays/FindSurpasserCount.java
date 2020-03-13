package com.arrays;

public class FindSurpasserCount {
    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 3, 0, 8, 1};
        int n = nums.length;

        System.out.println("Given array is ");
        printArray(nums, n);
        System.out.println("Surpasser Count of" + " array is ");
        findSurpasser(nums, n);

    }

    public static void findSurpasser(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    count++;
                }
            }
            System.out.print(count + " ");

        }
    }

    public static void printArray(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}

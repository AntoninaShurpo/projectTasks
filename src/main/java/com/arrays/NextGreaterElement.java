package com.arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {13, 7, 6, 12}; //{11, 13, 21, 3}; // {13, 7, 6, 12}
        int n = nums.length;
        printNextGreaterEl(nums, n);
    }

    public static void printNextGreaterEl(int[] nums, int n) {
        int next;
        int i;
        int j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    next = nums[j];
                    break;
                }
            }
            System.out.println(nums[i] + " -- " + next);
        }
    }
}

package com.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 15, 22, 35};
        int key = 22;
        int last = nums.length - 1;
        binarySearch(nums, 0, last, key);
    }

    private static void binarySearch(int[] nums, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (nums[mid] < key) {
                first = mid + 1;
            } else if (nums[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found");
        }
    }
}

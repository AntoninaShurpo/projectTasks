package com.arrays;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        BinarySearchRecursion obj = new BinarySearchRecursion();
        int[] nums = {2, 3, 4, 10, 40};
        int n = nums.length;
        int key = 10;
        int result = obj.binarySearchRecursion(nums, 0, n-1, key);
        if (result == -1) {
            System.out.println("Element Not present");
        } else System.out.println("Element found at index " + result);
    }

    public int binarySearchRecursion(int[] nums, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] > key) {
                return binarySearchRecursion(nums, left, mid - 1, key);
            }
            return binarySearchRecursion(nums, mid + 1, right, key);
        }
        return -1;

    }
}

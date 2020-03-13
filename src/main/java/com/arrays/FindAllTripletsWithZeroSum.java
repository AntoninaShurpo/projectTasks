package com.arrays;

import java.util.Arrays;

public class FindAllTripletsWithZeroSum {
    public static void main(String[] args) {
        int nums[] = {0, -1, 2, -3, 1};
        System.out.println("Given nums: " + Arrays.toString(nums));
        int n = nums.length;
        findTriplets(nums, n);
    }

    public static void findTriplets(int[] nums, int n) {
        boolean found = false;
        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {
            int left = i + 1;
            int right = n - 1;
            int x = nums[i];
            while (left < right) {
                if (x + nums[left] + nums[right] == 0) {
                    System.out.println("Found triplets: ");
                    System.out.print(x + " ");
                    System.out.print(nums[left] + " ");
                    System.out.println(nums[right] + " ");
                    left++;
                    right--;
                    found = true;
                } else if (x + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        if (found == false) {
            System.out.println("No triplets found");
        }
    }
}

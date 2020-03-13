package com.arrays;

import java.util.Arrays;

public class EveryElementsRepeatedButOne {

    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 2, 1, 6, 4, 3, 2, 5, 3};
        System.out.println("Given nums: " + Arrays.toString(nums));
        findBruteForce(nums);
    }

    public static void findBruteForce(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (!visited[i]) { //visited[i] == false
                boolean isDuplicate = false;
                for (int j = i + 1; j < nums.length; j++) {
                    if (x == nums[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (!isDuplicate)
                    System.out.println("Element appear only once in array - " + x);
            }
        }
    }


}
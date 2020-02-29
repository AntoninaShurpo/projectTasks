package com.strings;

public class ReverseIntegers {
    public static void main(String[] args) {
        int nums = 1234567;
        System.out.println("Given integer numbers: " + nums);
        System.out.println("Reversed integer numbers: " + reversedNums(nums));
    }

    public static int reversedNums(int nums) {
        int reversedNum = 0;
        while (nums > 0) {
            reversedNum = reversedNum * 10 + nums % 10;
            nums = nums / 10;
        }
        return reversedNum;
    }
}

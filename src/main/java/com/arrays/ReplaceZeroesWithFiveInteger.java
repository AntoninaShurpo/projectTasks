package com.arrays;

public class ReplaceZeroesWithFiveInteger {
    public static void main(String[] args) {
        int value = 10120;
        System.out.println("Given value: " + value);
        System.out.println("Result value after replacement: " + convert0To5(value));
    }

    public static int convert0To5Rec(int value) {
        if (value == 0) {
            return 0;
        }
        int digit = value % 10;
        if (digit == 0) {
            digit = 5;
        }
        return convert0To5Rec(value / 10) * 10 + digit;
    }

    public static int convert0To5(int value) {
        if (value == 0) {
            return 5;
        } else {
            return convert0To5Rec(value);
        }
    }
}

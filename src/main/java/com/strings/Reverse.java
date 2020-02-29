package com.strings;

public class Reverse {
    public static void main(String[] args) {
        String input = "GeeksforGeeks";
        System.out.println("Given string to reverse: " + input);

        System.out.println("Reversed string is: ");

    }


    public static void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left] = s[right];
        left++;
        s[right] = tmp;
        right--;
        helper(s, left, right);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);

    }
}

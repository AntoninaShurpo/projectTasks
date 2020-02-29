package com.strings;

public class PalindromeGivenString {
    public static void main(String[] args) {
        String str = "abbba"; //"palindrome"
        System.out.println("Given string: " + str);
        System.out.println("Is given string is Palindrome?");
        if (isPalindrome(str))
            System.out.print("Yes");
        else System.out.print("No");

    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}

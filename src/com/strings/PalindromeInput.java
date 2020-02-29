package com.strings;

import java.util.Scanner;

public class PalindromeInput {

    public static void main(String[] args) {
        System.out.println("Enter string to check for Palindrome: ");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        System.out.println("Is entered string is Palindrome?");
        if (isPalindromeInput(str))
            System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean isPalindromeInput(String str) {
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


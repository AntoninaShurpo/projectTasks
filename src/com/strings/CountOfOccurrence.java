package com.strings;

import java.util.Scanner;

public class CountOfOccurrence {
    public static void main(String[] args) {
        String str = "aaaabbbc";
        System.out.println("Given string is: " + str);
 //       Scanner sc = new Scanner(System.in);
        getOccurringChar(str);
    }

    public static void getOccurringChar(String str) {
        final int MAX_CHAR = 256;
        int count[] = new int[MAX_CHAR];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }
            if (find == 1) {
                System.out.println("Count of occurrence " + str.charAt(i) + " : " + count[str.charAt(i)]);
            }
        }
    }


}

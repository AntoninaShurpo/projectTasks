package com.strings;

public class CountOfOccurrence {
    static final int  maxChar= 256;
    static int count[] = new int[maxChar];

    public static void main(String[] args) {
        String str = "aabbbcdde";
        System.out.println("Given string is: " + str);
        getOccurringChar(str);
    }

    public static void getOccurringChar(String str) {

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

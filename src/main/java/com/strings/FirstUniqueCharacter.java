package com.strings;

public class FirstUniqueCharacter {
    //static final int NoOfChars = 256;
    static char[] count = new char[50];

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstNonRepeating(str);
        System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty" : "First non-repeating character is " + str.charAt(index));
    }

    public static void getCharCountArray(String str) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
    }

    public static int firstNonRepeating(String str) {
        getCharCountArray(str);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

}



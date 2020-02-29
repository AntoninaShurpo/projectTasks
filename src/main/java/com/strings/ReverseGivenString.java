package com.strings;

public class ReverseGivenString {
    public static void main(String[] args) {
        String string = "AMAZON";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: " + string);
        System.out.println("String after reverse: " + reverse);
    }
}


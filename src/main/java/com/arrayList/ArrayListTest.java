package com.arrayList;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args)
            throws IOException {
        int n = 5;
        ArrayList<Integer> nums = new ArrayList<>(n);
        for (int i = 1; i < n; i++) {
            nums.add(i);
        }
        System.out.println(nums);

        nums.remove(3);
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}

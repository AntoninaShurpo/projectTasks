package com.classes;

import java.util.Calendar;

public class Example1 {
    private int x;
    private int y = 71;
    public final int CURRENT_YEAR= 2020;
    protected static int bonus;
    static String version = "JAVA SE 13";
    protected Calendar now;

    public int method(int z){
        z++;
        int a;
        a = 4;
        a++;
        now = Calendar.getInstance();
        return a + z + x + y;
    }
}




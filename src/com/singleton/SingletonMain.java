package com.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        test2();
    }

    private static void test1() {
        ChocolateBoiler s1 = ChocolateBoiler.getUniqueInstance();
        System.out.println("" + s1.toString());
        ChocolateBoiler s2 = ChocolateBoiler.getUniqueInstance();
        System.out.println("" + s2.toString());
    }

    private static void test2() {
        (new MyThread(300L)).start();
        (new MyThread(300L)).start();

    }
}

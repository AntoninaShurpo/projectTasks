package com.singleton;

public class ExtendSingleton {
    private static ExtendSingleton instance = null;

    private ExtendSingleton() {}

    public static ExtendSingleton newInstance() {
        System.out.println("thread: " + Thread.currentThread().getId() + ", Start");
        if (instance == null) {
        System.out.println("thread: " + Thread.currentThread().getId() + ", instance is null");
            synchronized (ExtendSingleton.class) {
                System.out.println("thread: " + Thread.currentThread().getId() + ", synchronized");
                if (instance == null) {
                    System.out.println("thread: " + Thread.currentThread().getId() + ", synchronized instance is null");
                    instance = new ExtendSingleton();
                    System.out.println("thread: " + Thread.currentThread().getId() + ", synchronized instance was inited");
                }
            }
        }
        System.out.println("thread: " + Thread.currentThread().getId() + ", instance ready to be returned");
        return instance;
    }
}

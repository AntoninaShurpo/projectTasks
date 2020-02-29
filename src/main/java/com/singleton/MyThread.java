package com.singleton;

public class MyThread extends Thread {
    private Long time = 0L;

    public MyThread(Long time) {
        this.time = time;
    }
    @Override
    public void run() {
        System.out.println("thread: " + Thread.currentThread().getId());
        try {
            Thread.sleep(time);
            ExtendSingleton s1 = ExtendSingleton.newInstance();
            System.out.println("" + s1.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.gsafety.test.unit18;

public class Test18 {
    private static int count = 100;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new AddThread(count),"ADD-1");
        Thread thread2 = new Thread(new SubThread(count),"SUB-1");
        Thread thread3 = new Thread(new AddThread(count),"ADD-2");
        Thread thread4 = new Thread(new SubThread(count),"SUB-2");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

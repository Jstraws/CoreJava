package com.revature.threads;

public class Counter {

    private static int count;

    public static int getCount() {
        return count;
    }

    public static synchronized void incrementCount() {
        count++;
        System.out.println(count);
    }

    public Counter() {

    }



}

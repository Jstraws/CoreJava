package com.revature.threads;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();

        Thread t2 = new MyThread();
        t2.start();
    }

    /*
    Two ways to create a thread: Extend Thread or implement Runnable and pass it to a Thread
    Threadsafe - one thread at a time can access (Synchronized keyword, works for methods, variables, objects, code blocks)

     */
}

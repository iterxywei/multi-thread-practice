package com.xywei.multiThread.p2;


public class VolatileExample {
    int x = 0;
    volatile boolean v = false;

    public void writer() {
        x = 42;
        v = true;
    }

    public void reader() {
        if (v == true) {
            System.out.println("x=" + x);
        }
    }

    public static void main(String[] args) {
//        VolatileExample volatileExample = new VolatileExample();
//        new Thread(() -> {
//            volatileExample.writer();
//        }).start();
//
//        new Thread(() -> {
//            volatileExample.reader();
//        }).start();

        new VolatileExample(4,false);

    }


    public VolatileExample(int x, boolean v) {
        System.out.println(this);
        this.x = x;
        this.v = v;
    }
}


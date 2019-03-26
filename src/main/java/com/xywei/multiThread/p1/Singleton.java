package com.xywei.multiThread.p1;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE);
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.INSTANCE);
    }

}

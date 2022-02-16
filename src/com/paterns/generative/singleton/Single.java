package com.paterns.generative.singleton;

public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
//        if(ourInstance == null) {
//            synchronized (Single.class) {
//                if (ourInstance == null) {
//                    ourInstance = new Single();
//                }
//            }
//        }
        return ourInstance;
    }

    private Single() {
    }
}

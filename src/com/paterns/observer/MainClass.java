package com.paterns.observer;

public class MainClass {
    public static void main(String[] args) {
        Blog blog = new Blog();
        Observer o1 = new Subscriber("Bob 1");
        Observer o2 = new Subscriber("Bob 2");
        Observer o3 = new Subscriber("Bob 3");
        blog.register(o1);
        blog.register(o2);
        blog.postMessage("Hello 1");
        blog.unregister(o2);
        blog.register(o3);
        blog.postMessage("Hello 2");
    }
}

package com.paterns.behavioral.observer;

public class Subscriber implements Observer {
    private String name;
    private Subject blog;

    public void setSubject(Subject blog) {
        this.blog = blog;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) blog.getUpdate(this);
        System.out.println(name + " - New msg from Blog: " + msg);
    }
}

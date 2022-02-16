package com.paterns.generative.factory.my_example.domain;

public abstract class SmartPhone {

    public abstract String getOS();

    public abstract int getRAM();

    public abstract String getModel();


    @Override
    public String toString() {
        return "SmartPhone{ " +
                "OS " + getOS() +
                " RAM " + getRAM() +
                " Model " + getModel() + "}";
    }
}

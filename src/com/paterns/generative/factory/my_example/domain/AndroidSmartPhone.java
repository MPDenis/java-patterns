package com.paterns.generative.factory.my_example.domain;

public class AndroidSmartPhone extends SmartPhone{

    private String OS;
    private int RAM;
    private String model;

    public AndroidSmartPhone(String OS, int RAM, String model) {
        this.OS = OS;
        this.RAM = RAM;
        this.model = model;
    }

    @Override
    public String getOS() {
        return this.OS;
    }

    @Override
    public int getRAM() {
        return this.RAM;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}

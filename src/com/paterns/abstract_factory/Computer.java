package com.paterns.abstract_factory;

public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "CPU: " + getCPU() + " RAM: " + getRAM() + " HDD: " + getHDD();
    }
}

package com.paterns.generative.factory.more_example.factory;

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
}

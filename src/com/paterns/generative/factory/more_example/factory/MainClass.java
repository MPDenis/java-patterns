package com.paterns.generative.factory.more_example.factory;

public class MainClass {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "8 Gb", "1 Tb", "3.5 GHz");
        Computer server = ComputerFactory.getComputer("Server", "8 Gb", "1 Tb", "3.5 GHz");
    }
}

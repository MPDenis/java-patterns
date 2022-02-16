package com.paterns.generative.abstract_factory;

public class MainClass {
    public static void main(String[] args) {
        ComputerAbstractFactory mainFactory = new ServerFactory("8 Gb", "512 Gb", "3.2 GHz");

        Computer pc1 = ComputerFactory.getComputer(mainFactory);
        Computer pc2 = ComputerFactory.getComputer(mainFactory);

    }
}

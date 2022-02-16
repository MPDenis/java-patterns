package com.paterns.strustural.decorator.refactoring_guru_example;

public interface DataSource {

    void writeData(String data);

    String readData();
}
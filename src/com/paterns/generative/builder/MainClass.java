package com.paterns.generative.builder;

public class MainClass {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                .setFirstName("A")
                .setAge(30)
                .setLastName("B")
                .setEmail("A")
                .createPerson();
    }
}

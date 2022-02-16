package com.paterns.generative.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String city;
    private final String address;
    private final String phone;
    private final String email;
    private final int age;
    private final int salary;

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String city;
        private String address;
        private String phone;
        private String email;
        private int age;
        private int salary;

        public Person createPerson() {
            return new Person(firstName, lastName, middleName, city, address, phone, email, age, salary);
        }

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder() {
        }
    }

    private Person(String firstName, String lastName, String middleName, String city, String address, String phone, String email, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }
}

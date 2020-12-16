package com.spring.firstproject.task.demo;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Imie: " + firstName +
                ", nazwisko: " + lastName +
                ", wiek: " + age;
    }
}

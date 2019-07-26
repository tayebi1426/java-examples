package com.examples.webservice.model.ws;

public class Person {

    private String uniqueCode;
    private String firstName;
    private String lastName;
    private Byte age;

    public Person() {
    }

    public Person(String uniqueCode, String firstName, String lastName, Byte age) {
        this.uniqueCode = uniqueCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}

package com.company;

public class Person {
    private int age;
    private String firstName;
    private String address;
    private String lastName ;
    private String contact;

    public int getAge() {
        return age;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
public String getFullname(){
        return firstName +" "+ lastName;
}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(int age, String firstName, String address, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.address = address;
        this.lastName = lastName;
        System.out.println("Yes");
    }
}


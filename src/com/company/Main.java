package com.company;

public class Main {

    public static void main(String[] args) {
	Person manu= new Person(26, "Manu", "canada","parbh");
        System.out.println(manu.getAge());
        System.out.println(manu.getFirstName());
        System.out.println(manu.getAddress());
        System.out.println(manu.getLastName());
        manu.changeAge(21);
        System.out.println(manu.getFullname());
        System.out.println("New Feature added");
        System.out.println("FEature 2 added");
    }
}

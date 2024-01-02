package com.telran.org.homework_23_11_2023;

public class Client {
    private final int uniqueID;
    private final String name;
    private final int age;
    private final String phoneList;

    public Client(int uniqueID, String name, int age, String phoneList) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.age = age;
        this.phoneList = phoneList;
    }

    public Object getPhoneType() {
        return phoneList;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

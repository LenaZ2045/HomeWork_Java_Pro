package com.telran.org.homework26_09_2023;

public class Phone {
    private String number = "(503) 643-2123";
    private String model = "Samsung";
    private String name = "Diane";
    private int weight = 166;

    public Phone() {
    }

    public Phone(String model, int weight, String name, String number) {
        this.model = model;
        this.weight = weight;
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String receiveCall() {
        return name;
    }
}

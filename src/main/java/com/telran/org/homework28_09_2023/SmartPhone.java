package com.telran.org.homework28_09_2023;

public class SmartPhone extends Phone {
    private String ownNumber;

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    @Override
    public void call(String phoneName) {
        //First part phrase in this class
        System.out.println("The phone " + phoneName + " " + getOwnNumber());
        //Call second part phrase from parent class
        super.call(phoneName);
    }

    @Override
    public void receiveCall(String phoneName) {
        //First part phrase in this class
        System.out.println("The phone " + phoneName + " " + getOwnNumber());
        //Call second part phrase from parent class
        super.receiveCall(phoneName);
    }
}

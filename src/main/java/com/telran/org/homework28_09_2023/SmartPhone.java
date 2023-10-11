package com.telran.org.homework28_09_2023;

public class SmartPhone extends Phone {
    private String ownNumber;

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public String getOwnNumber() {
        setOwnNumber("(333) 333-3333");
        return ownNumber;
    }

    @Override
    public void call() {
        System.out.println("The phone " + getPhoneName3() + " " + getOwnNumber());
        super.call();
    }

    @Override
    public void receiveCall() {
        System.out.println("The phone " + getPhoneName3() + " " + getOwnNumber());
        super.receiveCall();
    }
}

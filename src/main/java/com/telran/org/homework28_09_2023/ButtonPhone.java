package com.telran.org.homework28_09_2023;

public class ButtonPhone extends Phone {

    private String ownNumber;

    public String getOwnNumber() {
        setOwnNumber("(111) 111-1111");
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call() {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber());
        super.call();
    }

    @Override
    public void receiveCall() {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber());
        super.receiveCall();
    }
}

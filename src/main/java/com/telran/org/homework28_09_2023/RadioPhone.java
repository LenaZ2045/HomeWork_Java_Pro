package com.telran.org.homework28_09_2023;

public class RadioPhone extends Phone {

    private String ownNumber;

    public String getOwnNumber() {
        setOwnNumber("(222) 222-2222");
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call() {
        System.out.println("The phone " + getPhoneName2() + " " + getOwnNumber());
        super.call();
    }

    @Override
    public void receiveCall() {
        System.out.println("The phone " + getPhoneName2() + " " + getOwnNumber());
        super.receiveCall();
    }
}

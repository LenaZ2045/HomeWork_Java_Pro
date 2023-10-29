package com.telran.org.homework28_09_2023;

public class ButtonPhone extends Phone {

    private String ownNumber;

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String numberCall) {
        //First part phrase in this class
        System.out.println("The phone " + getPhoneName() + " " + ownNumber);
        //Call second part phrase from parent class
        super.call(numberCall);
    }

    @Override
    public void receiveCall(String numberReceiveCall) {
        //First part phrase in this class
        System.out.println("The phone " + getPhoneName() + " " + ownNumber);
        //Call second part phrase from parent class
        super.receiveCall(numberReceiveCall);
    }
}

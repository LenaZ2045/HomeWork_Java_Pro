package com.telran.org.homework28_09_2023;

public class Phone {

    private String phoneName;
    // in Phone class I need to have only one variable "name" when creating objects in each we will have own copy with its own variable


    public String getPhoneName() {
        return phoneName;
    }


    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(String numberCall) {
        System.out.println("Try to make a call to number " + numberCall);
    }

    public void receiveCall(String numberReceiveCall) {
        System.out.println("Try to receive a call from number " + numberReceiveCall);
    }
}

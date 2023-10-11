package com.telran.org.homework28_09_2023;

public abstract class Phone {

    private String phoneName;

    private String phoneName2;
    private String phoneName3;

    private final String number = "(503) 798-7647";

    public String getPhoneName() {
        setPhoneName("Button Phone");
        setPhoneName2("Radio Phone");
        setPhoneName3("Smart Phone");
        return phoneName;
    }


    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setPhoneName2(String phoneName2) {
        this.phoneName2 = phoneName2;
    }

    public void setPhoneName3(String phoneName3) {
        this.phoneName3 = phoneName3;
    }

    public String getPhoneName2() {
        return phoneName2;
    }

    public String getPhoneName3() {
        return phoneName3;
    }

    public void call() {
        System.out.println("Try to make a call to number " + number);
    }

    public void receiveCall() {
        System.out.println("Try to receive a call from number " + number);
    }
}

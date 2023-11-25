package com.telran.org.homework28_09_2023;

public class PhoneApp {
    public static void main(String[] args) {
        // Task one begins here
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("button phone"); // set name for this phone
        buttonPhone.setOwnNumber("111-111-1111"); // set number for this phone
        buttonPhone.call("444-444-4444"); // call to (button phone makes call to 444-444-4444)
        buttonPhone.receiveCall("555-555-5555"); // receive from (button phone receives call from 555-555-5555)
        System.out.println();

        RadioPhone radioPhone = new RadioPhone(); // created an object class
        radioPhone.setPhoneName("radio phone");
        radioPhone.setOwnNumber("222-222-2222");
        radioPhone.call("444-444-4444"); // call to (radio phone makes call to 444-444-4444)
        radioPhone.receiveCall("555-555-5555"); // receive from (radio phone receives call from 555-555-5555)
        System.out.println();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("smart phone");
        smartPhone.setOwnNumber("333-333-3333");
        smartPhone.call("444-444-4444"); // (smart-phone makes call to 444-444-4444)
        smartPhone.receiveCall("555-555-5555"); // (smart-phone receives call from 555-555-5555)
        System.out.println();
        //End of the task one

        //Start of the task two with *
        makeCall(buttonPhone, "222-222-2222"); // button phone makes call to radio phone
        makeCall(buttonPhone, "333-333-3333"); // button phone makes call to smart-phone
        System.out.println();
        makeCall(radioPhone, "333-333-3333"); // radio phone makes call to smart-phone
        makeCall(radioPhone, "111-111-1111"); // radio phone makes call to button phone
        System.out.println();
        makeCall(smartPhone, "111-111-1111"); // smart-phone makes call to button phone
        makeCall(smartPhone, "222-222-2222"); // smart-phone makes call to radio phone
        System.out.println();

        receiveCall(buttonPhone, "333-333-3333"); // button phone receives call from smart-phone
        receiveCall(buttonPhone, "222-222-2222"); // button phone receives call from radio phone
        System.out.println();
        receiveCall(radioPhone, "111-111-1111"); // radio phone receives call from button phone
        receiveCall(radioPhone, "333-333-3333"); // radio phone receives call from smart-phone
        System.out.println();
        receiveCall(smartPhone, "222-222-2222"); // smart-phone receives call from radio phone
        receiveCall(smartPhone, "111-111-1111"); // smart-phone receives call from button phone
        System.out.println();
        //End of the task two
    }

    //Use parent type to for variable "phone" to receive any class(ButtonPhone,SmartPhone,RadioPhone) for makingCall
    public static void makeCall(Phone phone, String number) {
       phone.call(number);
    }

    //Use parent type to for variable "phone" to receive any class(ButtonPhone,SmartPhone,RadioPhone) for receivingCall
    public static void receiveCall(Phone phone, String number) {
        phone.receiveCall(number);

    }
}

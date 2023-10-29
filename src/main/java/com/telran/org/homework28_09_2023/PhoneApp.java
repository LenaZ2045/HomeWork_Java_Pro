package com.telran.org.homework28_09_2023;

public class PhoneApp {
    public static void main(String[] args) {
// Task one begins here
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("button phone"); // set name for this phone
        buttonPhone.setOwnNumber("111-111-1111"); // set number for this phone
        buttonPhone.call("444-444-4444"); // call to
        buttonPhone.receiveCall("555-555-5555"); // receive from

        RadioPhone radioPhone = new RadioPhone(); // created an object class
        radioPhone.setPhoneName("radio phone");
        radioPhone.setOwnNumber("222-222-2222");
        radioPhone.call("444-444-4444"); // call to
        radioPhone.receiveCall("555-555-5555"); // receive from

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("smart phone");
        smartPhone.setOwnNumber("333-333-3333");
        smartPhone.call("444-444-4444");
        smartPhone.receiveCall("555-555-5555");
        //End of the task one

        //Start of the task two with *
        makeCall(buttonPhone, "222-222-2222");
        makeCall(radioPhone, "333-333-3333");
        makeCall(smartPhone, "111-111-1111");

        receiveCall(buttonPhone, "333-333-3333");
        receiveCall(radioPhone, "111-111-1111");
        receiveCall(smartPhone, "222-222-2222");
        //End of the task two
    }

    //Use parent type to for variable "phone" to receive any class(ButtonPhone,SmartPhone,RadioPhone)
    public static void makeCall(Phone phone, String number) {
       phone.call(number);
    }

    //Use parent type to for variable "phone" to receive any class(ButtonPhone,SmartPhone,RadioPhone)
    public static void receiveCall(Phone phone, String number) {
        phone.receiveCall(number);

    }
}

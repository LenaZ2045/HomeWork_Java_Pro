package com.telran.org.homework28_09_2023;

public class PhoneApp {
    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.call();
        buttonPhone.receiveCall();
        RadioPhone radioPhone = new RadioPhone();
        radioPhone.call();
        radioPhone.receiveCall();
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.receiveCall();

        System.out.println();
        ButtonPhone[] buttonPhones = new ButtonPhone[3];
        RadioPhone[] radioPhones = new RadioPhone[3];
        SmartPhone[] smartPhones = new SmartPhone[3];

        Phone[] phones = {buttonPhone, radioPhone, smartPhone};
        for (Phone phone : phones) {
            phone.call();
        }

        makeCall(phones, buttonPhones, radioPhones, smartPhones);

        System.out.println();
        Phone[] phones1 = {buttonPhone, radioPhone, smartPhone};
        for (Phone phone : phones1) {
            phone.receiveCall();
        }

        receiveCall(phones1, buttonPhones, radioPhones, smartPhones);

    }

    public static void makeCall(Phone[] phones, ButtonPhone[] buttonPhones, RadioPhone[] radioPhones, SmartPhone[] smartPhones) {
        int button = 0;
        int radio = 0;
        int smart = 0;
        for (Phone phone : phones) {
            if (phone instanceof ButtonPhone) {
                buttonPhones[button] = (ButtonPhone) phone;
            }
            if (phone instanceof RadioPhone) {
                radioPhones[radio] = (RadioPhone) phone;
            }
            if (phone instanceof SmartPhone) {
                smartPhones[smart] = (SmartPhone) phone;
            }
        }
    }

    public static void receiveCall(Phone[] phones, ButtonPhone[] buttonPhones, RadioPhone[] radioPhones, SmartPhone[] smartPhones) {
        int button = 0;
        int radio = 0;
        int smart = 0;
        for (Phone phone : phones) {
            if (phone instanceof ButtonPhone) {
                buttonPhones[button] = (ButtonPhone) phone;
            }
            if (phone instanceof RadioPhone) {
                radioPhones[radio] = (RadioPhone) phone;
            }
            if (phone instanceof SmartPhone) {
                smartPhones[smart] = (SmartPhone) phone;
            }
        }
    }
}

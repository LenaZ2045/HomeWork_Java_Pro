package com.telran.org.homework26_09_2023;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Created two objects by class 'Person'");
        System.out.println();
        Person person = new Person();
        person.setName("Kleopatra");
        person.setFullName("Egyptian");
        person.setAge(120);
        person.move();
        person.talk();
        Person person1 = new Person("John", "Buyer", 37);
        person1.move();
        person1.talk();
        System.out.println();
        System.out.println("Создала три экземпляра класса 'Phone'");
        System.out.println();
        Phone phone = new Phone(); // 1ый экземпляр класса
        System.out.println("1st Model: " + phone.getModel() + ", weight: " + phone.getWeight() + ", owner is " + phone.getName() + ", ✆ # " + phone.getNumber());
        Phone phone1 = new Phone("iPhone", 240, "Eugene","(503) 235-6451"); // 2ой экземпляр класса
        System.out.println("2nd Model: " + phone1.getModel() + ", weight: " + phone1.getWeight() + ", owner is " + phone1.getName() + ", ✆ # " + phone1.getNumber());
        Phone phone2 = new Phone("Motorola", 137, "Silva","(971) 408-9237"); // 3ий экземпляр класса
        System.out.println("3rd Model: " + phone2.getModel() + ", weight: " + phone2.getWeight() + ", owner is " + phone2.getName() + ", ✆ # " + phone2.getNumber());

        System.out.println("Вам звонит: " + phone.receiveCall() + " -по ✆ " + phone.getNumber());
        System.out.println("Вам звонит: " + phone1.receiveCall() + " -по ✆ " + phone1.getNumber());
        System.out.println("Вам звонит: " + phone2.receiveCall() + " -по ✆ " + phone2.getNumber());

    }
}

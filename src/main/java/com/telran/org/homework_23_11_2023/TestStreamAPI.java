package com.telran.org.homework_23_11_2023;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamAPI {

    public static void main(String[] args) {
        System.out.println();
        List<String> lastName = Arrays.asList("Letinova", "Slovak", "Belgian", "Carol", "Kirkland", "Kievka", "Krasnorod");
        System.out.println("Last Name list " + lastName);
//        Task # 1

        System.out.println();
        List<String> kLastNames = lastName.stream()
                .filter(name -> name.startsWith("K"))
                .toList();
        System.out.println("Last Name list which starts from letter 'K' " + kLastNames);
//        Task # 2

        System.out.println();
        List<String> sorted = lastName.stream().sorted().toList();
        System.out.println("Last Name list is sorted alphabetically " + sorted);
//        Task # 3

        Client client1 = new Client(123, "George", 31, "stationary");
        Client client2 = new Client(115, "Tamale", 29, "stationary");
        Client client3 = new Client(227, "Cris", 27, "mobile");
        Client client4 = new Client(345, "Geo", 45, "stationary");
        Client client5 = new Client(234, "Tom", 47, "mobile");
        Client client6 = new Client(456, "Steven", 31, "stationary");
        System.out.println();
        List<Client> clients = Arrays.asList(client1, client2, client3, client4, client5, client6);
        Optional<Client> oldestStationaryPhoneClient = clients.stream()
                .filter(client -> client.getPhoneType().equals("stationary"))
                .max(Comparator.comparingInt(Client::getAge));
        if (oldestStationaryPhoneClient.isPresent()) {
            System.out.println("The oldest client who use stationary telephone is: " + oldestStationaryPhoneClient.get().getName());
        } else {
            System.out.println("Client with stationary telephone is not available.");
        }
//        Task # 4

        Auto auto1 = new Auto(111, "black", "Audi", 0, 50000);
        Auto auto2 = new Auto(222, "navy", "Honda", 17999, 20000);
        Auto auto3 = new Auto(333, "black", "Audi", 20, 40000);
        Auto auto4 = new Auto(444, "white", "Toyota", 0, 30000);
        Auto auto5 = new Auto(555, "black", "Chevrolet", 0, 10000);
        System.out.println();
        List<Auto> autos = Arrays.asList(auto1, auto2, auto3, auto4, auto5);
        autos.stream()
                .filter(auto -> auto.getVehicleColor().equals("black") && auto.getVehicleMileage() == 0)
                .forEach(System.out::println);
        System.out.println();
        List<Auto> autosNew = Arrays.asList(auto1, auto2, auto3, auto4, auto5);
        long uniqueBrandsCount = autosNew.stream()
                .filter(auto -> auto.getVehiclePrice() >= 30000 && auto.getVehiclePrice() <= 50000)
                .map(Auto::getVehicleBrand)
                .distinct()
                .count();
        System.out.println("Unique vehicle brands quantity with cost price from $30000 to $50000 thousands are: " + uniqueBrandsCount);

        System.out.println();
        List<Auto> autosUni = Arrays.asList(auto1, auto2, auto3, auto4, auto5);
        List<String> uniqueBrands = autosUni.stream()
                .filter(auto -> auto.getVehiclePrice() >= 30000 && auto.getVehiclePrice() <= 50000)
                .map(Auto::getVehicleBrand)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Two unique vehicle brands from $30000 to $50000 thousands are : " + uniqueBrands);

    }
}

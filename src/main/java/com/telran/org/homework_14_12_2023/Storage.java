package com.telran.org.homework_14_12_2023;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Storage<T> {
    private Map<T, Integer> elements = new HashMap<>();

    public void addElement(T element) {
        elements.put(element, elements.getOrDefault(element, 0) + 1);
    }

    public Map<T, Integer> getElements() {
        return elements;
    }

    public static void main(String[] args) {
        Storage<Character> charStorage = new Storage<>();
        Storage<Integer> intStorage = new Storage<>();

        try (FileReader reader = new FileReader("C:\\Users\\bogyp\\IdeaProjects\\HomeWork Java Pro\\src\\main\\java\\com\\telran\\org\\homework_14_12_2023\\file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.isDigit(c)) {
                    intStorage.addElement(c - '0');
                } else if (Character.isLetter(c)) {
                    charStorage.addElement((char) c);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Occurrences of letters: " + charStorage.getElements());
        System.out.println("Occurrences of digits: " + intStorage.getElements());
    }
}
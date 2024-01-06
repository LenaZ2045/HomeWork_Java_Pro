package com.telran.org.homework_14_12_2023;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashFunction {
    public static void main(String[] args) {
        String originalText = "C:\\Users\\bogyp\\IdeaProjects\\HomeWork Java Pro\\src\\main\\java\\com\\telran\\org\\homework_14_12_2023\\file.txt";
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : originalText.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        String hashString = "";
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            hashString += entry.getKey() + entry.getValue().toString();
        }
        try {
            File hashFile = new File("customHash.txt");
            FileWriter hashWriter = new FileWriter(hashFile);
            hashWriter.write(hashString);
            hashWriter.close();
            File numberFile = new File("customNumbers.txt");
            FileWriter numberWriter = new FileWriter(numberFile);
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                numberWriter.write(entry.getValue().toString() + "_" + entry.getKey() + entry.getValue().toString() + "\n");
            }
            numberWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
package com.telran.org.homework_21_11_2023;

import java.util.*;
import java.io.*;

public class SearchEngine {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> ht = new Hashtable<>();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the filename that you want to search values for.");
        String filename = kb.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!ht.containsKey(word)) {
                        ht.put(word, new ArrayList<>());
                    }
                    ht.get(word).add(line);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
        System.out.println("Enter the search term:");
        String searchTerm = kb.nextLine();
        if (ht.containsKey(searchTerm)) {
            System.out.println("The search term \"" + searchTerm + "\" appears in the following lines:");
            for (String line : ht.get(searchTerm)) {
                System.out.println(line);
            }
        } else {
            System.out.println("The search term \"" + searchTerm + "\" does not appear in the file.");
        }
    }
}

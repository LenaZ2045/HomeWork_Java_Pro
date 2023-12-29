package com.telran.org.homework09_11_2023;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

    public static void main(String[] args) {
        String[] arr = {"I", "am", "a", "student", "!", "am", "I", "?"};
        Map<String, String> stringText = new HashMap<>();
        for(String string : arr) {
            if(stringText.containsKey(string)) {
                String word = String.valueOf(stringText.get(string));
                stringText.put(string, word+1);
            }else {
                stringText.put(string, String.valueOf(1));
            }
        }
        System.out.println(stringText);

        System.out.println(stringText.values());
        System.out.println(stringText.size());
        stringText.forEach((s, s2) -> {
            System.out.println("Word = " + s + " String-value = " + s2);
        });
        System.out.println();

        Map<Character, Integer> map = new HashMap<>();
        String text = "Hello, world!";
        countCharacters(map, text);
        System.out.println("Character | Count");
        System.out.println("------------------");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%-9s | %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static void countCharacters(Map<Character, Integer> map, String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
}
package com.telran.org.homework_14_12_2023;

import java.io.*;
import java.util.*;

public class EncodedDecoded {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\bogyp\\IdeaProjects\\HomeWork Java Pro\\src\\main\\java\\com\\telran\\org\\homework_14_12_2023\\file.txt";
        String encodedFileName = "encoded.txt";
        String decodedFileName = "decoded.txt";

        // Task 1: Read the input file and store the character indices in a map
        Map<Character, List<Integer>> charIndices = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            int index = 0;
            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (!charIndices.containsKey(c)) {
                        charIndices.put(c, new ArrayList<>());
                    }
                    charIndices.get(c).add(index);
                    index++;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Save the character indices to a file
        try {
            FileWriter writer = new FileWriter(encodedFileName);
            for (Map.Entry<Character, List<Integer>> entry : charIndices.entrySet()) {
                writer.write(entry.getKey() + entry.getValue().toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Task 2: Read the encoded file and generate the decoded text
        StringBuilder decodedText = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(encodedFileName)); // SHOULD I ENTER HERE THE FILE PATH?
            String line = reader.readLine();
            while (line != null) {
                char c = line.charAt(0);
                List<Integer> indices = new ArrayList<>();
                String[] indexStrings = line.substring(1).split(",");
                for (String indexString : indexStrings) {
                    indices.add(Integer.parseInt(indexString.trim())); // SOMETHING IS NOT WORKING FROM THIS LINE, WHAT?
                }
                Collections.sort(indices);
                for (int i = 0; i < indices.size(); i++) {
                    if (i == 0) {
                        decodedText.append(c);
                    } else {
                        int gap = indices.get(i) - indices.get(i - 1) - 1;
                        for (int j = 0; j < gap; j++) {
                            decodedText.append(" ");
                        }
                        decodedText.append(c);
                    }
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Save the decoded text to a file
        try {
            FileWriter writer = new FileWriter(decodedFileName);
            writer.write(decodedText.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Task 3: Compare the characters at the same index in the original and decoded files
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
            BufferedReader reader2 = new BufferedReader(new FileReader(decodedFileName));
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            int lineNum = 1;
            while (line1 != null && line2 != null) {
                if (!line1.equals(line2)) {
                    System.out.println("Error: Characters at line " + lineNum + " are not equal.");
                    System.out.println("Original: " + line1);
                    System.out.println("Decoded: " + line2);
                    break;
                }
                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }
            reader1.close();
            reader2.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
package com.telran.org.homework_14_12_2023;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateReadFile {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            PrintWriter pw = new PrintWriter(fos);
            pw.println("This is my family facts file! The oldest person in my family is Nikolai. He is born in 1926. The youngest member in my family is Samuel. Sam is born in 2022. The most big family is at my sister Anna. Anna has 8 people in her family. The smallest family is mine. I have 2 people in my family. I love my family!");
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

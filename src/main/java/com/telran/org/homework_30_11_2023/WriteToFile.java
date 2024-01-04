package com.telran.org.homework_30_11_2023;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
// Task # 1
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            PrintWriter pw = new PrintWriter(fos);
            pw.println("This is my first experience when I myself work with IO API. I can do everything!");
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
package com.telran.org.homework_30_11_2023;

import java.awt.*;
import java.io.*;

public class OpenFile {
    public static void main(String[] args) {
// Task # 2
        try {
            File file = new File("C:\\Users\\bogyp\\IdeaProjects\\HomeWork Java Pro\\src\\main\\java\\com\\telran\\org\\homework_30_11_2023\\output.txt");
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
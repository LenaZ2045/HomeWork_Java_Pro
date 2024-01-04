package com.telran.org.homework_30_11_2023;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
// Task # 3
        File directory = new File("path/to/directory");
        deleteDirectory(directory);
    }

    public static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteDirectory(file);
                }
            }
        }
        directory.delete();
    }
}

package com.ey.fileio;

import java.io.File;

public class FileSearchUtility {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Administrator\\Desktop\\day8 assignments"; 
        String fileName = "mydoc.java"; 

        searchFile(new File(folderPath), fileName);
    }

    public static void searchFile(File folder, String fileName) {
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                System.out.println("File found: " + file.getAbsolutePath());
            }
            else if (file.isDirectory()) {
                searchFile(file, fileName);
            }
        }
    }
}

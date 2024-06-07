package com.ey.fileio;

import java.io.File;

public class FolderContentsPrinter {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Administrator\\Desktop\\day8 assignments"; 
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        printFolderContents(folder);
    }

    public static void printFolderContents(File folder) {
        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Folder: " + file.getName());
                printFolderContents(file);
            }
        }
    }
}

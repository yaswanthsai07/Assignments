package com.ey.fileio;

import java.io.File;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        
        String sourceFilePath = "C:\\Users\\Administrator\\Desktop\\hello";
        String destinationFilePath = "C:\\Users\\Administrator\\Desktop\\hello1";

        try {
            
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException("Source file not found: " + sourceFilePath);
            }

            File destinationFile = new File(destinationFilePath);
            if (destinationFile.exists()) {
                System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String choice = reader.readLine().trim().toLowerCase();
                if (!choice.equals("yes")) {
                    System.out.println("Operation aborted.");
                    return;
                }
            }

            try (InputStream in = new FileInputStream(sourceFile);
                 OutputStream out = new FileOutputStream(destinationFile)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while copying the file: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error occurred while reading user input: " + e.getMessage());
        }
    }
}
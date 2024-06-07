package com.ey.fileio;

import java.io.*;
import java.util.Scanner;



public class ChargeRecordReader {
    public static void main(String[] args) {
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream("ChargeRecord.ser"));
            System.out.println("FromNumber\tToNumber\tCharge");
            while (true) {
                CallDetailRecord cdr = (CallDetailRecord) inputStream.readObject();
                System.out.println(cdr);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error occurred while closing the input stream: " + e.getMessage());
            }
        }
    }
}

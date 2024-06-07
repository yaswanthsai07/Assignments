package com.ey.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CallChargeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("ChargeRecord.ser"));
            while (true) {
                System.out.print("Enter fromNumber: ");
                int fromNumber = scanner.nextInt();
                System.out.print("Enter toNumber: ");
                int toNumber = scanner.nextInt();
                System.out.print("Enter duration (in minutes): ");
                float duration = scanner.nextFloat();

                CallDetailRecord cdr = new CallDetailRecord(fromNumber, toNumber, duration);
                outputStream.writeObject(cdr);

                System.out.print("Do you want to enter another call detail? (Yes/No): ");
                String choice = scanner.next().trim().toLowerCase();
                if (!choice.equals("yes")) {
                    break;
                }
            }
            System.out.println("Call details saved successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error occurred while closing the output stream: " + e.getMessage());
            }
            scanner.close();
        }
    }
}

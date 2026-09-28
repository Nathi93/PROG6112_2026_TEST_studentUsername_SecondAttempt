/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesaleapplication;

/**
 *
 * @author emeris
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Allow the user to select a console
        System.out.println("SELECT A CONSOLE DEVICE");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");

        System.out.print("Enter your selection (1-3): ");
        int choice = Integer.parseInt(input.nextLine());

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "NINTENDO SWITCH";
                break;

            default:
                System.out.println("Invalid console selection.");
                return;
        }

        // Capture store information
        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = Integer.parseInt(input.nextLine());

        // Instantiate the subclass
        ConsoleSales report = new ConsoleSales(
                consoleType, store, totalSales
        );

        // Display the report
        report.printReport();
    }
}
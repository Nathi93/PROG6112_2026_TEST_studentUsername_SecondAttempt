/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolesreport;

/**
 *
 * @author emeris
 */
public class GamingConsoleReport {

    public static void main(String[] args) {

        // Single-dimensional array
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Two-dimensional array: PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int highestTotal = 0;
        String highestCity = "";

        System.out.println("------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------");

        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", "PS5", "XBOX", "SWITCH");

        // Display sales report
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------");

        // Calculate each city's total and determine the highest
        for (int i = 0; i < cities.length; i++) {

            int cityTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-20s %d%n", cities[i], cityTotal);

            if (cityTotal > highestTotal) {
                highestTotal = cityTotal;
                highestCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + highestCity);
        System.out.println("------------------------------------------------------");
    }
}
package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Sandwich Shop!");
        System.out.print("Select your size! (1 for Regular, 2 for Large): ");
        int size = userInput.nextInt();

        double basePrice = 0;
        if (size == 1) {
            basePrice = 5.45;
        } else {
            basePrice = 8.95;
        }

        userInput.nextLine();
        System.out.print("Would you like it loaded? Y/N: ");
        String isLoaded = userInput.nextLine();

        double extraCost = 0;
        if (isLoaded.equalsIgnoreCase("Y")) {
            if (size == 1) {
                extraCost = 1.00;
            } else {
                extraCost = 1.75;
            }
        }

        double priceBeforeDisc = basePrice + extraCost;

        System.out.print("Please enter your age: ");
        int age = userInput.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = priceBeforeDisc * 0.10;
        } else if (age >= 65) {
            discount = priceBeforeDisc * 0.20;
        }

        double finalPrice = priceBeforeDisc - discount;

        System.out.println("\n--- Order Summary ---");
        System.out.printf("Final Price:", finalPrice);

        userInput.close();
    }
}
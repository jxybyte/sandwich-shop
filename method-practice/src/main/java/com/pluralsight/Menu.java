package com.pluralsight;

public class Menu {
    public static void main(String[] args) {
        System.out.println("First call:");
        displayMenu();

        System.out.println("Second call resuing the code.");
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");

    }
}

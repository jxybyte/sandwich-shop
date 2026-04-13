package com.pluralsight;;

public class Hello {
    public static void main(String[] args) {
        // Calling our custom methods
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    // "void" means this method just performs an action and doesn't "give back" a value
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}

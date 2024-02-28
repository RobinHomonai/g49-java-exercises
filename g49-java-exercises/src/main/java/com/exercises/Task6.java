package com.exercises;

import java.util.Scanner;

public class Task6 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        double subtraction = number1 - number2;

        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Subtraction: " + subtraction);
    }
}

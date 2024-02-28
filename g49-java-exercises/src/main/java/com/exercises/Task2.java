package com.exercises;

import java.util.Scanner;


public class Task2 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the year you want to check if it's a leap year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
        //scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

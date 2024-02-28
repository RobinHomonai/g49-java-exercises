package com.exercises;

import java.util.Scanner;

public class Task7 {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int inputSeconds = scanner.nextInt();

        int hours = inputSeconds / 3600;
        int remainingSeconds = inputSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

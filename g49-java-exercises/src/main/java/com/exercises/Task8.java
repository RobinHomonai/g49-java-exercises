package com.exercises;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void solve() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(500) + 1;

        int input;
        int numberOfGuesses = 0;

        do {
            System.out.print("Guess the number between 1-500: ");
            input = scanner.nextInt();
            numberOfGuesses++;

            if (input == randomNumber) {
                System.out.println("----------------------");
                System.out.println("Nice! You guessed the right number and it took you " + numberOfGuesses + " of times!");
            } else if (input < randomNumber) {
                System.out.println("The guess was too small...Have another try, mate");
            } else {
                System.out.println("The guess was too big...Have another try, mate");
            }
        } while (input != randomNumber);
    }
}
package edu.bekthedev;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 101);

        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1-10: ");

        do {
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too Low!");
            } else if (guess > randomNumber) {
                System.out.println("Too High!");
            } else {
                System.out.println("You Win!" + randomNumber);
                System.out.println("Number of attemps: " + attempts);
            }
        } while (guess != randomNumber);

        scanner.close();

    }
}
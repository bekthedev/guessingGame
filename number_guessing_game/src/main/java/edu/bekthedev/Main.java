package edu.bekthedev;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100; //exclusive so need to add + 1
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game!");
        System.out.printf("Guess a number between %d-%d\n", min, max);

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
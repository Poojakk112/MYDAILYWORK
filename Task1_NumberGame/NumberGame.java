// Project: Number Guessing Game

// Problem:
// Create a game where the computer generates a random number,
// and the user has to guess the correct number.

// Approach:
// 1. Generate a random number
// 2. Take user input
// 3. Compare guessed number with actual number
// 4. Give hints (too high / too low)
// 5. Repeat until correct guess

// Example:
// Input: 50
// Output: Too high / Too low / Correct guess
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != number);

        sc.close();
    }
}

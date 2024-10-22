import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int range = 100;
        int number = random.nextInt(range) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 10; // Limiting the number of attempts
        boolean hasWon = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between 1 and " + range + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Your guess is too low.");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've used all your attempts. The number was " + number + ".");
        }

        scanner.close();
    }
}

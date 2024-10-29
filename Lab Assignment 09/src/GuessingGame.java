import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // create an instance of the random class
        Random rand = new Random();

        // declare scanner var
        Scanner input = new Scanner(System.in);

        // welcome message
        System.out.println("Welcome to Number Guessing Game!");

        // generate a random number in the range [0 - 100]
        int random = rand.nextInt(101);

        // initialize a counter for guesses
        int counter = 0;
        int maxGuesses = 3;

        // while loop for guessing
        while (counter < maxGuesses) {
            // prompt the user for a number
            System.out.print("Guess a number in range [0 - 100]: ");
            int guess = input.nextInt();

            // check if the guess is out of range
            if (guess < 0 || guess > 100) {
                System.out.println("Out of range! Try again!");
                // give an extra turn by not incrementing the counter
                continue;
            }

            // check if the guess is correct
            if (guess == random) {
                System.out.println("Congratulations, you won!");
                break;
            } else if (guess > random) {
                System.out.println("Oops, too high!");
            } else {
                System.out.println("Oops, too low!");
            }

            // increment the counter after each valid guess
            counter++;

            // if the user has exhausted all guesses
            if (counter == maxGuesses) {
                System.out.println("You lost! Correct number was " + random + ".");
            }
        }

    }
}
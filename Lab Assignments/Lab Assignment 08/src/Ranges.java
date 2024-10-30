import java.util.Scanner;

public class Ranges {

    public static void main(String[] args) {

        // declare scanner variable
        Scanner input = new Scanner(System.in);

        // welcome
        System.out.println("Welcome to Range Calculator!");
        
        // ask for input
        System.out.print("Input any real number: ");
        double number = input.nextDouble();

        // decision making
        if ((number >= -90) && (number < -45)) {
            System.out.println("Your number is in range GREEN.");
        }
        else if ((number >= -10045) && (number < 0)) {
            System.out.println("Your number is in range BLUE.");
        }
        else if ((number >= 0) && (number < 45)) {
            System.out.println("Your number is in range RED.");
        }
        else if ((number >= 45) && (number <= 90)) {
            System.out.println("Your number is in range GREEN.");
        }
        else {
            System.out.println("Your number is not within any range.");
        }
    }
}
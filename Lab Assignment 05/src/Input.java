import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // outputs
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        System.out.println("You entered: " + integer);

        System.out.print("Next, enter a decimal: ");
        float decimal = input.nextFloat();
        System.out.println("You entered: " + decimal);

        System.out.print("Next, enter a word: ");
        String string = input.next();
        System.out.println("You entered the word: " + string);
        
        System.out.print("Last, enter a boolean value (true or false): ");
        Boolean bool = input.nextBoolean();
        System.out.println("You entered: " + bool);

    }
}
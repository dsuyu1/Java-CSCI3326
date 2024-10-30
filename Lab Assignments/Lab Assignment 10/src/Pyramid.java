import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        // initialize scanner variable
        Scanner input = new Scanner(System.in);

        // welcome the user
        System.out.println("Welcome to n x n Pyramid!");

        // ask for input
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println();

        // loop to print the triangle
        for (int i = 1; i <= n; i++) {
            // print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // move to the next line after each row
            System.out.println();
        }
    }
}
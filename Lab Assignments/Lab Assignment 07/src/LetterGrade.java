import java.util.Scanner; 

public class LetterGrade {

    public static void main(String[] args) {

        // declare scanner variable
        Scanner input = new Scanner(System.in);
        float grade;

        // intro
        System.out.println("Welcome to Letter Grade Calculator!");
        // prompt the user 
        System.out.print("Enter a score: ");
        grade = input.nextFloat();
        
        // if/else statements
        if (grade >= 90) {
            System.out.println("The letter grade is A.");
        } 
        else if (grade >= 80) {
            System.out.println("The letter grade is B."); 
        }
        else if (grade >= 70) {
            System.out.println("The letter grade is C.");
        }
        else if (grade >= 60) {
            System.out.println("The letter grade is D.");
        }
        else if (grade >= 0) {
            System.out.println("The letter grade is F.");
        }
        else {
            System.out.println("Oops you input a negative value!");
        }
    }
}
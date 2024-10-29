import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        // declare input variables
        int rows;
        int col;
        Scanner input = new Scanner(System.in);
        
        // prompt the user
        System.out.print("Enter rows: ");
        rows = input.nextInt();
        System.out.print("Enter columns: ");
        col = input.nextInt();

        // make first 2D array
        int[][] numsTable = new int[rows][col];

        // populate w/ numbers
        int count = 1; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numsTable[i][j] = count; 
                count++;
            }
        }

        // copy the 2D array in reverse
        int[][] numsTableCopy = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numsTableCopy[i][j] = numsTable[i][col - 1 - j];
                count--;
            }
        }

        // print the original and copied reversed array
        // original
        for(int i = 0; i < numsTable.length; i++) {
            for(int j = 0; j < numsTable[i].length; j++) {
                System.out.print(numsTable[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println(); // add a space between arrays

        // print out the copied reversed array
        for (int i = 0; i < numsTableCopy.length; i++) {
            for (int j = 0; j < numsTableCopy[i].length; j++) {
                System.out.print(numsTableCopy[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class PartyInventory {

    public static void main(String[] args) {

        // welcome the user
        System.out.println("Welcome to Party Inventory!");

        // prompt the user for the number of inventory items
        System.out.print("Enter # of inventory items: ");

        // declare & initialize scanner
        Scanner input = new Scanner(System.in);
        int totalitems = input.nextInt();
        input.nextLine();  // Consume leftover newline

        // declare arrays
        String[] itemnames = new String[totalitems];
        int[] itemamounts = new int[totalitems];

        // prompt the user for item names and amounts
        for (int i = 0; i < totalitems; i++) {
            System.out.print("Name & Amount: ");
            // read the whole line
            String line = input.nextLine(); // this takes both the string and the integer values
            
            // split the line into name and amount (assuming space between them)
            String[] parts = line.split(" "); // splits the line
            String tempname = parts[0];  // first part is the item name
            int tempamount = Integer.parseInt(parts[1]);  // second part is the amount

            itemnames[i] = tempname; // assigns the 'i'th index to a temporary variable for storage
            itemamounts[i] = tempamount;
        }
        // add a blank line
        System.out.println(); // for formatting

        // print out the inventory list
        System.out.println("Inventory:");
        for (int i = 0; i < totalitems; i++) {
            System.out.println("Item: " + itemnames[i] + ", " + "Amount: " + itemamounts[i]);
        }
    }
}
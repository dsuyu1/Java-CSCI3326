public class MixMatch {
    public static void main (String[] args) {
        
        // initializes and prints string user_name variable
        String user_name = "damian"; 
        System.out.println(user_name + ": String, used for storing text. Welcome " + user_name + "!");

        // initializes and prints char user_initial variable
        char user_initial = 'd';
        System.out.println(user_initial + ": char, stores a single character.");

        // initializes and prints short user_age variable
        short user_age = 18;
        System.out.println(user_age + ": short, stores whole numbers from -32768 to 32767.");

        // initializes and prints int user_id variable
        int user_id = 20640799;
        System.out.println(user_id + ": int,used to store whole numbers from -2147483648 to 2147483647.");

        // initializes and prints long earth_radius_meters variable
        long earth_radius_meters = 6400000;
        System.out.println(earth_radius_meters + ": long, used to store whole numbers from -9223372036854775808 to 9223372036854775807.");
       
        // initializes and prints float user_grade variable
        float user_grade = 99.9022f;
        System.out.println(user_grade + ": float, used to store fractional numbers up to 6 to 7 decimal digits.");
        
        // initializes and prints double pi variable
        double pi = 3.1415927;
        System.out.println(pi + ": double, also used to store fractional numbers up to 15 decimal digits");

        // initializes and prints boolean enrollstatus variable
        boolean enrollstatus = true;
        System.out.println(enrollstatus + ": boolean, stores true or false values.");

        // printing multiple data types in one string
        System.out.println("Hello " + user_name + ". " + user_name + "'s user ID is " + user_id + ". Their user initial is " + user_initial + ". The user's age is "
 + user_age + ". The first 9 digits of pi are " + pi + ".");
    }
}
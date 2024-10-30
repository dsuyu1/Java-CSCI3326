import java.util.Vector;

public class VectorPractice {

    public static void main(String[] args) {

        // declare an empty vector
        Vector<String> cars = new Vector<>();

        // add elements Toyota, Ford, Chevy, Mercedes, and Tesla
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Chevy");
        cars.add("Mercedes");
        cars.add("Tesla");

        // print the vector
        System.out.println(cars);

        // remove Chevy from the vector
        cars.remove(2);

        // print the vector
        System.out.println(cars);

        // add Audi as the second element
        cars.add(1, "Audi");

        // print the vector
        System.out.println(cars);

        // replace Mercedes with Cadillac using set()
        cars.set(3, "Cadillac");

        // print the vector
        System.out.println(cars);

        // clear the array
        cars.clear();







    }
}
// Importing the Car class
import dealership.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        // Currently Main can access all attributes directly.
        Car car1 = new Car();

        // Update this code to use your setter and getter methods instead.
        car1.set_make("Ford");
        car1.set_model("Mustang");
        car1.set_year(1880);

        System.out.println("Car1 Make: " + car1.get_make());
        System.out.println("Car1 Model: " + car1.get_model());
        System.out.println("Car1 Year: " + car1.get_year());
    }
}

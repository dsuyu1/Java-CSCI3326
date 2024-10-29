public class Dealership {
    public static void main(String[] args) throws Exception {
        // Test your code here.
    }
}

// Write your Car class here or create new Car.java file
class Car {
    public String make;
    public String model;
    public int year;

    Car(String carMake, String carModel, int carYear) {
        make = carMake;
        model = carModel;
        year = carYear;
    }

    public Boolean is_new() {
        return (year == 2024) || (year == 2025);
    }
} 
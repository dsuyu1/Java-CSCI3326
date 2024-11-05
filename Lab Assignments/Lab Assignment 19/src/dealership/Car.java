// Packaging the Car class
package dealership;

public class Car {
	// Atributes
	private String make;
	private String model;
	private int year;

	// Setter Methods
	public void set_make(String carMake) {
		make = carMake;
	}

	public void set_model(String carModel) {
		model = carModel;
	}

	public void set_year(int carYear) {
		if (carYear < 1886) {
			System.out.println("Error! You inputted an invalid year!");
		}
		else {
			year = carYear;
		}
	}

	// Getter Methods
	public String get_make() {
		return make;
	}

	public String get_model() {
		return model;
	}

	public int get_year() {
		return year;
	}

}

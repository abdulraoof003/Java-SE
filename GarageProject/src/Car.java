
public class Car extends Vehicle {
	boolean isConvertible;

	public Car(String registration, String make, int age,
			boolean isConvertible) {
		super(registration, make, age);
		this.isConvertible = isConvertible;
	}
	public String toString() {
		return super.toString() + " Convertible: " + this.isConvertible;
	}
}

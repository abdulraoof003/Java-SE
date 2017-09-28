
public abstract class Vehicle {

	String registration;
	String make;
	int age;

	public Vehicle(String registration, String make, int age) {
		this.registration = registration;
		this.make = make;
		this.age = age;
	}

	public String toString() {
		return "Registration: " + this.registration + " Make: " + this.make
				+ " Age: " + this.age;
	}

}

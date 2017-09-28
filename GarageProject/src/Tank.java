
public class Tank extends Vehicle {
	double firePower;

	public Tank(String registration, String make, int age, double firePower) {
		super(registration, make, age);
		this.firePower = firePower;
	}

	public String toString() {
		return super.toString() + " Firepower: " + this.firePower;
	}

}

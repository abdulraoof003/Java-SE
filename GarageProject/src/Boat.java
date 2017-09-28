
public class Boat extends Vehicle {
	int numberOfPropellers;

	public Boat(String registration, String make, int age,
			int numberOfPropellers) {
		super(registration, make, age);
		this.numberOfPropellers = numberOfPropellers;
	}

	public String toString() {
		return super.toString() + " Number Of Propellers: "
				+ this.numberOfPropellers;
	}

}

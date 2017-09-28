package library;

public class Borrower extends Person {
	double finesOwed;

	public Borrower(int personId, String Name, String address, double finesOwed) {
		super(personId, Name, address);
		this.finesOwed = finesOwed;
	}
}
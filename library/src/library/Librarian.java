package library;

public class Librarian extends Person {
	boolean currentEmployee;

	public Librarian(int personId, String Name, String address, boolean currentEmployee) {
		super(personId, Name, address);
		this.currentEmployee = currentEmployee;
	}
}

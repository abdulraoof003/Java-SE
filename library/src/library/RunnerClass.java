package library;

public class RunnerClass {

	static int countItem = 0;
	static int countPerson = 0;

	public static void main(String[] args) {
		// Runs all the methods

		// creates an object called Library
		Library lib = new Library();

		// Setting values for the instance of the book item

		Item book1 = new Book(countItem++, "The Hobbit", false, 0, "J R Tolkien");
		Item book2 = new Book(countItem++, "The Lord of the Rings", false, 0, "J R Tolkien");

		// Setting values for the instance of Dvd item
		Item Dvd1 = new Dvd(countItem++, "Gremlins", false, 0, "Joe Dante");
		Item Dvd2 = new Dvd(countItem++, "Superman", false, 0, "Richard Donner");

		// Setting values for the instance of Dissertation item
		Item Diss1 = new Dissertation(countItem++, "Quantam Theory", false, 0, "York");
		Item Diss2 = new Dissertation(countItem++, "Applied Mechanics", false, 0, "Leeds");

		// Add items into array itemList array
		lib.addItem(book1);
		lib.addItem(book2);
		lib.addItem(Dvd1);
		lib.addItem(Dvd2);
		lib.addItem(Diss1);
		lib.addItem(Diss2);

		//System.out.println(lib.itemList.get(2).toString());

	
		// Output all items in the library
		System.out.println("After all items are added");
		lib.outputItem();

		// Delete item on title
		String itemNameDelete = "Applied Mechanics";
		lib.removeItemByName(itemNameDelete);

		System.out.println("After Delete item");

		// Output all items in the library
		lib.outputItem();

		// Setting the values for the instance of librarian
		Person Lib1 = new Librarian(countPerson++, "Bill", "32 Great Road", true);
		Person Lib2 = new Librarian(countPerson++, "Kate", "15 Step Street", true);

		// Setting the values for the instance of borrower
		Person Borr1 = new Borrower(countPerson++, "Dan", "5 Cliffe Street", 0);
		Person Borr2 = new Borrower(countPerson++, "Shahzad", "11 Maple Grove", 0);

		// Add items into array personList array
		lib.addPerson(Lib1);
		lib.addPerson(Lib2);
		lib.addPerson(Borr1);
		lib.addPerson(Borr2);

		// Output all people who are associated with the library
		lib.outputPerson();

		// Delete item on person name and address
		String personNameDelete = "Bill";
		String personAddressDelete = "32 Great Road";
		lib.removePersonByNameAndAddress(personNameDelete, personAddressDelete);

		// update person name by matching on name and address
		String currentName = "Shahzad";
		String newName = "Shahzard";
		String address = "11 Maple Grove";
		lib.changeName(currentName, address, newName);

		System.out.println("After Delete Person");

		// Output all people who are associated with the library
		lib.outputPerson();

		// Try to check out item "The Hobbit" for "Borrower Kate".
		String itemCheckOut = "The Hobbit";
		int personId = 2;
		lib.checkOutItem(itemCheckOut, personId);

		// person below will not be found
		// personId = 7;
		String itemCheckIn = "The Hobbit";
		// Try to check in the item "The Hobbit" for "Borrower Kate".
		lib.checkInItem(itemCheckIn, personId);

		// Write items from the array into the items file
		lib.writeToFile();
		
		lib.readFile();

		// Output library items
		// System.out.println(book1.toString());
		// System.out.println(book2.toString());
		// System.out.println(Dvd1.toString());
		// System.out.println(Dvd2.toString());
		// System.out.println(Diss1.toString());
		// System.out.println(Diss2.toString());

		// Output library person
		// System.out.println(Lib1.toString());
		// System.out.println(Lib2.toString());
		// System.out.println(Borr1.toString());
		// System.out.println(Borr2.toString());
		//
		
		System.out.println("After reading file into arraylist");

		// Output all items in the library
		lib.outputItem();
		
	}
}

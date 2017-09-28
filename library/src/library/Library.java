package library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Library {

	// setting up an array to store library items
	public ArrayList<Item> itemList = new ArrayList<Item>();

	// add items into the array
	public void addItem(Item I) {
		itemList.add(I);
	}

	// outputting all items in the library
	public void outputItem() {
		for (Item I : itemList) {
			System.out.println(I);

		}
	}

	// Remove item from the library on title
	public void removeItemByName(String itemName) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).itemName == itemName) {
				itemList.remove(i);
			}
		}
	}

	// setting up an array to store person
	public ArrayList<Person> personList = new ArrayList<Person>();

	// add people into the array
	public void addPerson(Person P) {
		personList.add(P);
	}

	// outputting all people in the library
	public void outputPerson() {
		for (Person P : personList) {
			System.out.println(P);

		}
	}

	// Remove person from the library on name and address
	public void removePersonByNameAndAddress(String name, String address) {
		for (int i = 0; i < personList.size(); i++) {
			if ((personList.get(i).name == name) && (personList.get(i).address == address)) {
				personList.remove(i);
			}
		}
	}

	// Change person name by matching on current name and address
	public void changeName(String name, String address, String newName) {
		for (int i = 0; i < personList.size(); i++) {
			if ((personList.get(i).name == name) && (personList.get(i).address == address)) {
				personList.get(i).name = newName;
				System.out.println("name " + " name" + " changed to " + newName);
			}
		}
	}

	boolean matchFound = false;

	// Check out a book by matching on name
	public void checkOutItem(String checkOutName, int personId) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).itemName == checkOutName) {
				matchFound = true;
				if (itemList.get(i).borrowed) {
					System.out.println("Error Item " + checkOutName + " Already checked out");
					break;
				} else {
					itemList.get(i).borrowed = true;
					itemList.get(i).personId = personId;
					System.out.println("Item " + checkOutName + " Checked out now");
				}
			}
		}
		if (!matchFound) {
			System.out.println("Item " + checkOutName + " Not found in library");
		}
	}

	boolean matchFound2 = false;

	// Check in a book by matching on name and personId
	public void checkInItem(String checkInName, int personId) {
		for (int i = 0; i < itemList.size(); i++) {
			if ((itemList.get(i).itemName == checkInName) && (itemList.get(i).personId == personId)) {
				matchFound2 = true;
				if (!itemList.get(i).borrowed) {
					System.out.println("Error Item " + checkInName + " Not currently checked out");
				} else {
					itemList.get(i).borrowed = false;
					itemList.get(i).personId = 0;
					System.out.println("Item " + checkInName + " successfully checked In");
				}
			}
		}
		if (!matchFound2) {
			System.out
					.println("Item " + checkInName + " Not found in library" + " or person " + personId + " not found");
		}

	}

	// Write item array list to file
	public void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter("itemfile.txt", "UTF-8");

			for (int i = 0; i < itemList.size(); i++) {
				if (i != 0) {
					writer.print("\n");

				}
				writer.print(itemList.get(i));

			}

			writer.close();
		} catch (IOException e) {
			// do something
		}
	}

	// Read from file
	public boolean readFile() {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader("itemfile.txt"));

		} catch (FileNotFoundException e) {

			return false;

		}

		try {

			StringBuilder sb = new StringBuilder();

			String line = br.readLine();

			while (line != null) {

				// System.out.println("test "+line);

				itemList.add(addItem(line));

				line = br.readLine();

				// System.out.println("test "+line);

			}

		} catch (IOException e) {

			return false;

		} finally {

			try {

				br.close();

			} catch (IOException e) {

				return false;

			}

			return true;

		}

	}

	private Item addItem(String a) {

		Item q = null;

		StringTokenizer st = new StringTokenizer(a, "{");

		String temp = st.nextToken();

		if (temp.equals("book")) {

			StringTokenizer st_2 = new StringTokenizer(st.nextToken(), "'");

			// discarding itemId=
			st_2.nextToken();
			// gets next item and converts into string
			int itemId = Integer.parseInt(st_2.nextToken());

			// discarding name==
			st_2.nextToken();
			// sets the name
			String itemName = st_2.nextToken();

			// discarding borrowed=
			st_2.nextToken();

			boolean borrowed = false;

			String borrowedTemp = st_2.nextToken();

			if (borrowedTemp.equals("true")) {

				borrowed = true;

			}

			// discarding personId=
			st_2.nextToken();
			// gets next item and converts into integer
			int personId = Integer.parseInt(st_2.nextToken());

			// discarding author=
			st_2.nextToken();
			// gets next item and converts into string
			String author = st_2.nextToken();

			q = new Book(itemId, itemName, borrowed, personId, author);

		} else if (temp.equals("dissertation")) {

			StringTokenizer st_2 = new StringTokenizer(st.nextToken(), "'");

			// discarding itemId=
			st_2.nextToken();
			// gets next item and converts into string
			int itemId = Integer.parseInt(st_2.nextToken());

			// discarding name==
			st_2.nextToken();
			// sets the name
			String itemName = st_2.nextToken();

			// discarding borrowed=
			st_2.nextToken();

			boolean borrowed = false;

			String borrowedTemp = st_2.nextToken();

			if (borrowedTemp.equals("true")) {

				borrowed = true;

			}

			// discarding personId=
			st_2.nextToken();
			// gets next item and converts into integer
			int personId = Integer.parseInt(st_2.nextToken());

			// discarding universityname=
			st_2.nextToken();
			// gets next item and converts into string
			String universityName = st_2.nextToken();

			q = new Dissertation(itemId, itemName, borrowed, personId, universityName);

		} else if (temp.equals("Dvd")) {

			StringTokenizer st_2 = new StringTokenizer(st.nextToken(), "'");

			// discarding itemId=
			st_2.nextToken();
			// gets next item and converts into string
			int itemId = Integer.parseInt(st_2.nextToken());

			// discarding name==
			st_2.nextToken();
			// sets the name
			String itemName = st_2.nextToken();

			// discarding borrowed=
			st_2.nextToken();

			boolean borrowed = false;

			String borrowedTemp = st_2.nextToken();

			if (borrowedTemp.equals("true")) {

				borrowed = true;

			}

			// discarding personId=
			st_2.nextToken();
			// gets next item and converts into integer
			int personId = Integer.parseInt(st_2.nextToken());

			// discarding director=
			st_2.nextToken();
			// gets next item and converts into string
			String director = st_2.nextToken();

			q = new Dvd(itemId, itemName, borrowed, personId, director);

		}

		return q;

	}

}

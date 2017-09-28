package librarytest;

import static org.junit.Assert.*;

import org.junit.*;

//imports the objects from library
import library.*;

public class testlibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void test_1() {

		
		Library lib = new Library();

		// Setting values for the instances of library items
		Item book1 = new Book(1, "The Hobbit", false, 0, "J R Tolkien");
		lib.addItem(book1);
		
		Person Lib2 = new Librarian(2,"Kate","15 Step Street",true);
		lib.addPerson(Lib2);
		
		System.out.println(book1.toString());
		assertFalse(lib.itemList.get(0).borrowed);

	}

}

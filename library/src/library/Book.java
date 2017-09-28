package library;


public class Book extends Item {
	String author;

	public Book(int itemId, String itemName, boolean borrowed, int personId, String author) {
		super(itemId, itemName, borrowed, personId);
		this.author = author;
	}

	public String toString() {

		return "book{" +
                "itemId='" + itemId + '\'' +
                ", name='" + itemName + '\'' +
                ", borrowed='" + borrowed + '\'' +
                ", personId='" + personId + '\'' +
                ", book author='" + this.author + '\'' +
                '}';

		
//		return "book," + "itemId," + itemId + ",Name," + itemName + ",borrowed," + borrowed + ",personid,"
//				+ personId + ",Author," + this.author;
	}

}
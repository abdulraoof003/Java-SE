package library;


public class Dvd extends Item {
	String director;

	public Dvd(int itemId, String itemName, boolean borrowed, int personId, String director) {
		super(itemId, itemName, borrowed, personId);
		this.director = director;
	}

	public String toString() {

		return "Dvd{" +
                "itemId='" + itemId + '\'' +
                ", name='" + itemName + '\'' +
                ", borrowed='" + borrowed + '\'' +
                ", personId='" + personId + '\'' +
                ", director name='" + this.director + '\'' +
                '}';

		
		
//		return "dvd"+"itemId=: " + itemId + " Name: " + itemName + " borrowed " + borrowed 
//				+ " personid " + personId + " Director: " + director ;
	}

}
package library;

public class Dissertation extends Item {
	String universityName;

	public Dissertation(int itemId, String itemName, boolean borrowed, int personId, String universityName) {
		super(itemId, itemName, borrowed, personId);
		this.universityName = universityName;
	}

	public String toString() {
	
		return "dissertation{" +
                "itemId='" + itemId + '\'' +
                ", name='" + itemName + '\'' +
                ", borrowed='" + borrowed + '\'' +
                ", personId='" + personId + '\'' +
                ", university name='" + this.universityName + '\'' +
                '}';

    }
		
		
		
//		return "dissertation," + "itemId=," + itemId + ",Name," + itemName + " borrowed " + borrowed + " personid "
//				+ personId + " University Name: " + this.universityName;
//	}

}
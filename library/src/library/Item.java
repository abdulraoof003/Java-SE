package library;

public abstract class Item {


	int itemId;
	String itemName;
	public boolean borrowed;
	int personId;
	
	public Item(int itemId, String itemName, boolean borrowed, int personId) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.borrowed = borrowed;
		this.personId = personId;
			
	}

//	public String toString() {
//		
//	}

}
	
	


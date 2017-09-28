
public class iterateArrayAndDisplay {

	public static void main(String[] args) {

		int[] arrayOfints = new int[10];

		for (int i = 0; i < arrayOfints.length; i++) {
			
			arrayOfints[i] = i + 1;   

		}
		
		for (int i = 0; i < 10; i++) {
			
			arrayOfints[i] = arrayOfints[i] * 10;
			System.out.println(arrayOfints[i]);

		}
		
	}

	
}

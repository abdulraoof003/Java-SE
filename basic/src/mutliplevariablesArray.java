
public class mutliplevariablesArray {

	public static void main(String[] args) {
		int numberOne = 0;
		int numberTwo = 0;
		int nextArray = 0;

		int[] arrayOfints = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i <= 8; i++) {
			numberOne = arrayOfints[i];
			nextArray = i + 1;
			numberTwo = arrayOfints[nextArray];
			System.out.println(returnNumber(numberOne, numberTwo, i));
		}
	}

	public static int returnNumber(int numberOne, int numberTwo, int i) {

		int returnNumbervar = 0;
		
		if (numberOne == 0 & numberTwo != 0) {
			returnNumbervar = numberTwo;
		} else if (numberTwo == 0 & numberOne != 0) {
			returnNumbervar = numberOne;
		} else {
			returnNumbervar = numberOne;
		}

		return returnNumbervar;

	}

}

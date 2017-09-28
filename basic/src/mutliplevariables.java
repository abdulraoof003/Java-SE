
public class mutliplevariables {

	public static void main(String[] args) 
	{
		int numberOne = 7;
		int numberTwo = 7;
		
		System.out.println(returnCalculations(numberOne, numberTwo));

	}

	public static int returnCalculations(int numberOne, int numberTwo) 
	{

		int addTotal = 0;
		addTotal = numberOne + numberTwo;
		
		
		return addTotal;
		
	}
	
}

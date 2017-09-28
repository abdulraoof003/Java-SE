
public class mutliplevariablesboolean {

	public static void main(String[] args) 
	{
		int numberOne = 7;
		int numberTwo = 7;
		boolean performCalcualtion = false;
		
		System.out.println(returnCalculations(numberOne, numberTwo, performCalcualtion));

	}

	public static int returnCalculations(int numberOne, int numberTwo, boolean performCalcualtion) 
	{

		int addTotal = 0;
		
		if (performCalcualtion)
			addTotal = numberOne + numberTwo;
	
		return addTotal;
		
	}
	
}

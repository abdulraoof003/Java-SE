
public class mutliplevariablesreturnother {

	public static void main(String[] args) 
	{
		int numberOne = 5;
		int numberTwo = 1;
				
		System.out.println(returnNumber(numberOne, numberTwo));

	}

	public static int returnNumber(int numberOne, int numberTwo) 
	{

		int returnNumbervar = 0;
		
		if (numberOne == 0 & numberTwo != 0){
			returnNumbervar = numberTwo;}
		else if (numberTwo == 0 & numberOne != 0){
			returnNumbervar = numberOne;
		}
		else {returnNumbervar = numberOne;}
			
	
		return returnNumbervar;
		
	}
	
}

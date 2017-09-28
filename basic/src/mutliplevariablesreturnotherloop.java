
public class mutliplevariablesreturnotherloop {

	public static void main(String[] args) 
	{
		int numberOne = 5;
		int numberTwo = 1;
		
		for (int i = 0; i < 10; i++)
			System.out.println(returnNumber(numberOne, numberTwo, i));

	}

	public static int returnNumber(int numberOne, int numberTwo, int i) 
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

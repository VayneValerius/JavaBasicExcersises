
public class Exc11 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arrayOfInt = new int[10];
		
		for (int fillArray = 0; fillArray < arrayOfInt.length; fillArray++)
		{
			arrayOfInt[fillArray] = fillArray;
		}
		
		for (int timesArray = 0; timesArray < arrayOfInt.length; timesArray++)
		{
			arrayOfInt[timesArray] = arrayOfInt[timesArray] * 10;
			System.out.println(arrayOfInt[timesArray]);
		}
	}

}

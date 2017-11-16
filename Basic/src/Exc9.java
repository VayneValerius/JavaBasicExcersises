
public class Exc9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arrayOfInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int counter = 0; counter < 10; counter++)
		{
			System.out.println(Addition(2, arrayOfInt[counter], true));
			System.out.println(Addition(2, counter, false));
		}
	}
	
	public static int Addition(int a, int b, boolean isAddOrMult)
	{
		if (a == 0)
		{
			return b;
		}
		else if (b == 0)
		{
			return a;
		}
		else if (isAddOrMult)
		{
			return a + b;
		}
		else 
		{
			return a * b;
		}

	}

}

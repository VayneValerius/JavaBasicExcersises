
public class Exc8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for (int counter = 0; counter < 10; counter++)
		{
			System.out.println(Addition(2, counter, true));
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

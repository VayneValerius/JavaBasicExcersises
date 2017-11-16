
public class Exc7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(Addition(2, 0, true));
		System.out.println(Addition(2, 4, false));
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

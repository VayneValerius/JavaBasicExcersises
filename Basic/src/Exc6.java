
public class Exc6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(Addition(2, 4, true));
	}

	public static int Addition(int a, int b, boolean isAddOrMult)
	{
		
		if (isAddOrMult)
		{
			return a + b;
			
		}
		
		else 
		{
			return a * b;
		}
		
	}
}

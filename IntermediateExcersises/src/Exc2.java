
public class Exc2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(uniqueSum(3,2,1));
	}
	
	public static int uniqueSum(int a,int b,int c)
	{
		if (a == b && b == c)
		{
			return 0;
		}
		else if (a == b)
		{
			return c;
		}
		else if (a == c)
		{
			return b;
		}
		else if (b == c)
		{
			return a;
		}
		else
		{
			return a+b+c;
		}
	}

}

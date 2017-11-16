
public class Exc3 {

	public static void main(String[] args) 
	{
		System.out.println(tempLevels(90, false));
		// TODO Auto-generated method stub

	}
	
	public static boolean tempLevels(int temp, boolean isSummer)
	{
		if (isSummer && temp <= 100 && temp >= 60)
		{
			return true;
		}
		else if (isSummer = false && temp <= 90 && temp >=60)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}


public class Exc1 
{
	public static void main(String[] args) 
	{
		System.out.println(blackjack(22, 19));
	}
	
	public static int blackjack(int firstNum, int secondNum)
	{
		int greatestNum = 0;
		int altNum = 0;
		
		if (firstNum >= secondNum)
		{
			greatestNum = firstNum;
			altNum = secondNum;
		}
		else
		{
			greatestNum = secondNum;
			altNum = firstNum;
		}
		
		if (greatestNum <= 21)
		{
			return greatestNum;
		}
		else if (altNum <= 21)
		{
			return altNum;
		}
		else
		{
			return 0;
		}
	}
}

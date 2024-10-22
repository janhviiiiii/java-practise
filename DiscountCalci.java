import java.util.*;
class DiscountCalci
{
	public static int toCalc(int a)
	{
		if(a<=1000)
		{	
			System.out.print("NO DISCOUNT: ");
			return 0;
		}
		else if(a>1000 && a<=5000)
		{
			System.out.print("10% DISCOUNT: ");
			return a-a*10/100;
		}		
		else if(a>5000 && a<=10000)
		{
			System.out.print("15% DISCOUNT: ");
			return a-a*15/100;
		}
		else
		{
			System.out.print("20% DISCOUNT: ");
			return a-a*20/100;	
		}


		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter price: ");
		int price=sc.nextInt();
		
		System.out.print(toCalc(price));

		sc.close();
	}
}
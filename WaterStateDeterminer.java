import java.util.*;
class WaterStateDeterminer
{
	public static String toCheck(int a)
	{
		/*
		if(a<=0)
		{
			return "Solid";
		}
		else if(a>=1 && a<=99)
		{	
			return "Liquid";

		}
		else
		{
			return "Gas";
		}
			
		*/
		return ((a<=0)?"Solid":((a>=1&&a<=99)?"Liquid":"Gas"));
				
				
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temp: ");
		int temp=sc.nextInt();
		System.out.print(toCheck(temp));

		sc.close();
	}
}
import java.util.*;
class NumberComparision
{
	public static int toCheck(int a, int b)
	{
		{
			return (Math.max(a,b));		
		}
	
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1=sc.nextInt();
		System.out.print("Enter num2: ");
		int num2=sc.nextInt();

		System.out.print("Larger Number: "+toCheck(num1,num2));

		sc.close();
	}
}
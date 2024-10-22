import java.util.*;
class IsDivisible
{
	public String divisibleBy(int a)
	{
		if(a%3==0 && a%5==0)
		{
			return "div by 3 & 5";
		}
		else if(a%3==0)
		{
			return "div by 3";
		}
		else if(a%5==0)
		{
			return "div by 5";
		}
		else
		{
			return "not div by either 3 or 5";
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		IsDivisible obj=new IsDivisible();
		System.out.print(obj.divisibleBy(num));

		sc.close();
	}
}
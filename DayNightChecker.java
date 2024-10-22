import java.util.*;
class DayNightChecker
{
	public static String type(int a)
	{
		String str=(a>=6&&a<=18)?"Day":"Night";
		return str;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Cuurent hour(0-23): ");
		int num1=sc.nextInt();
		
		System.out.print(type(num1));
		sc.close();
	}
}
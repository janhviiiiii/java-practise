import java.util.*;
class LoanEligibilityChecker
{
	public static String toCheck(int a, int s, int we)
	{
		/*if((a>=21 && a<=60) && (s>20000) && (we>2))
		{
			return "Eligible";
		}
		else 
		{	
			return "Not Eligible";

		}*/
			
		
		return ((a>=21 && a<=60) && (s>20000) && (we>2))?"Eligible":"Not Eligible";
				
				
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		System.out.print("Enter Salary: ");
		int sal=sc.nextInt();
		System.out.print("Enter Work Experience (in yrs): ");
		int workExp=sc.nextInt();
		
		System.out.print(toCheck(age,sal,workExp));

		sc.close();
	}
}
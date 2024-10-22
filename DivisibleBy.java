import java.util.*;
class  DivisibleBy
{
	public void isDivisible(int a)
	{
		if(a%5==0 && a%11==0)
		{
			System.out.println(a + " is DIVISIBLE BY 5 AND 11");
		}
		else
		{
			System.out.println(a + " is NOT DIVISIBLE BY 5 AND 11");
		}
	}

	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");	
	int num = sc.nextInt();
		
	DivisibleBy d1= new DivisibleBy();
	d1.isDivisible(num);

	sc.close();
	}

}
import java.util.*;
class Calculator
{
	public int calc(int a, int b, String operation)
	{
		int sol;

		switch(operation)
		{
			case "add":
				sol =  a+b;
				break;

			case "sub":
				sol = a-b;
				break;

			case "mul":
				sol = a*b;
				break;
	
			case "div":
				sol = a/b;
				break;

			case "mod":
				sol = a%b;
				break;

	
			default:
				sol = -1;
				break;
		}
		return sol;
	}

	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1: ");
		int num1= sc.nextInt();
		System.out.print("Enter Num2: ");
		int num2= sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Operation to perform: ");
		String op= sc.nextLine();


		Calculator c1 = new Calculator();
		System.out.println("result: " +num1+" " +op+" "+num2+" " +"\n"+c1.calc(num1,num2,op));
		
		sc.close();
	}

}
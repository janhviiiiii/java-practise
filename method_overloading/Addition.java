package method_overloading;

public class Addition{
	
	static int num1 = 10;
	static int num2 = 20;
	static double num3 = 30;

	//parameter -> no arg
	public static void add()
	{
		System.out.println(num1 + "+" + num2 + "="+ (num1+num2));
	}
	//parameter
	public static void add(int n1, int n2)
	{
		System.out.println(n1 + "+" + n2 + "="+ (n1+n2));
	}

	//different data-type
	public static void add(int n2, double n3)
	{
		System.out.println(n2 + "+" + n3 + "=" +(n2+n3));
	}

	//different data-typesequence
	public static void add(double n3, int n2)
	{
		System.out.println(n3 + "+" + n2 + "=" +(n3+n2));
	}

	public static void main(String[] args)
	{
		add(); //no of arg
		add(num1, num2); //same datatype
		add(num2, num3); //different datatype
		add(num3, num2); //diff datatype -> sequence
	}
	

}
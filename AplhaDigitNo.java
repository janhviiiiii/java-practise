import java.util.*;
class AlphaDigitNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println(ch + " is Alphabet");
		} 
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is Number");
		}
		 // Check if it's a negative sign (for negative numbers)
        	else if (ch == '-') {
            System.out.println(ch + " is potentially part of a negative number");
        }
		else 
		{
			System.out.println(ch+" is Special Character");
		}


		sc.close();
	}
}
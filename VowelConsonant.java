import java.util.*;
class VowelConsonant
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch = sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I'  || ch=='O'  || ch=='U'  || ch=='a'  || ch=='e'  || ch=='i'  || ch=='o'  || ch=='u')
		{
			System.out.println(ch + " is Vowel");
		} 
		else
		{
			System.out.println(ch+" is Consonant");
		}

		sc.close();

	}
}
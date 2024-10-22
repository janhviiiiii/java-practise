import java.util.*;
class DayOfWeek
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter DAY NUMBER BETWN 1-7: ");	
	int num = sc.nextInt();

	sc.close();
		
	switch(num)
	{
		case 1:
		System.out.print("MONDAY");	
		break;
		case 2:
		System.out.print("TUESDAY");	
		break;
		case 3:
		System.out.print("WEDNESDAY");	
		break;
		case 4:
		System.out.print("THURSDAY");	
		break;			
		case 5:
		System.out.print("FRIDAY");	
		break;
		case 7 :
		System.out.print("SUNDAY");	
		break;
		
		default:
		System.out.print("enter valid number.");	
		break;
		
		
	}
	}


}
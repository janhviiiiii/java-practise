import java.util.*;
class TempConversion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in degree celcius: ");	
		double d = sc.nextDouble();
		
		//formula -> °C = (°F - 32) × 5/9. °F = (9/5) °C+32.
		//(37°C × 9/5) + 32 = 98.6°F

		
		double f = (d* 9/5) + 32;
		System.out.println(d+" degree celcius in fahrenheit = "+f);

		sc.close();
	
	}
}
package looping;
import java.util.Scanner;
public class EnterZero {
    
    public static void main(String[] args) 
    {
        int countPositive=0;
        int countNegative=0;
        int countZero=1;

        Scanner sc=new Scanner(System.in);
        int num=0;

        do
        {   
            System.out.println("Enter a number: ");
            num=sc.nextInt();

            if(num>0)
            {
                countPositive++;
            }
            if(num<0)
            {
                countNegative++;
            }

        }
        while(num!=0);

        System.out.println("Positive Number: "+countPositive);
        System.out.println("Negative Number: "+countNegative);
        System.out.println("Zero Number: "+countZero);

        sc.close();
    }
}

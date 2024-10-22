import java.util.*;

public class BinaryToDecimal
{

    //power function
    public static int pow(int a, int b)
    {
        int res=1;
        for(int i=1;i<=b; i++)
        {
            res*=a;
        }
        return res;
    }

    //count digit function
    public static int countDigits(int num)
    {
        int count=0;
        while(num!=0)
        {
            num/=10;
            count++;
        }
        return count;
    }

    //decimal digit function
    public static int decimalDigit(int num)
    {
        int sum=0;
        // int rem=0;
        int count=countDigits(num);
        for(int i=0; i<count; i++)
        {
            // rem=num%10;
            sum+=(num%10)*pow(2, i);
            num/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int number=sc.nextInt();
        System.out.println("Binary Number: "+number);
        System.out.println("Decimal Number: "+decimalDigit(number));

        sc.close();
    }
}
import java.util.Scanner;

public class DecimalToBinary {

    public static int binaryDigit(int num)
    {

        if(num==0)
        {
            return 0;
        }


        int bin=0;
        int rem;
        int placeValue=1; //to place the digit in correct order 
        while(num!=0)
        {

            rem = num%2;
            bin+=rem*placeValue; //bin=bin+(rem*placeValue)
            num/=2;          
            placeValue*=10;
        }

        return bin;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int number=sc.nextInt();

        System.out.println("Decimal Number: "+number);
        System.out.println("Binary Number: "+binaryDigit(number));

        sc.close();


    }
}

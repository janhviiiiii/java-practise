package looping;

import java.util.Scanner;

public class SumNaturalNo {

    public static int sum(int n)
    {
        // int sum = n*(n+1)/2;
        // return sum;

        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num=sc.nextInt();
        System.out.print("Sum of "+num+" Natural Numbers = "+sum(num));


        sc.close();
    }


    
}

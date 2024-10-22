package looping;

import java.util.Scanner;

public class Factorial {

    public static int fact(int a)
    {

        //5!= 5*4*3*2*1;
        int fact=1;   
        for(int i=a; i>=1; i--)
        {
            fact=fact*i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        System.out.print("Factorial of "+num+" = "+fact(num));
        sc.close();
        
    }
    
        


}

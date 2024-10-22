package looping;

import java.util.Scanner;

public class CountDigit {
    public static int count(int a)
    {
        int count=0;

        while(a!=0)
        {
            a=a/10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.print("number if digit in "+num+" = "+count(num));
        sc.close();


    }
}

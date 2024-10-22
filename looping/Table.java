package looping;

import java.util.Scanner;

public class Table {
    public static void tab(int a)
    {
        int p=1;

        for(int i=1; i<=10; i++)
        {
            p=a*i;
            System.out.println(a+" * "+ i + " = "+p);
        }

        // return p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Table of "+num);
        System.out.println();
        tab(num);
        sc.close();
    }
}

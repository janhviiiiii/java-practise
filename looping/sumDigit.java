package looping;
import java.util.Scanner;
public class sumDigit {

    public static int sum(int num){

        int count=0;
        int sum=0;
        for(int i=num; i!=0; i=i/10)
        {
            sum=sum+i%10;
            count++;   
        }
        System.out.println("Count of Digits: "+count);
        return sum;
    }

    public static int product(int num){

        // int count=0;
        int res=1;
        for(int i=num; i!=0; i=i/10)
        {
            res*=i%10;
            // count++;   
        }
        // System.out.println("Count of Digits: "+count);
        return res;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        System.out.print("Number: "+n);
        System.out.println();
        System.out.println("Sum of Digits: "+sum(n));

        System.out.println("Product of Digits: "+product(n));
        sc.close();
    }
}

package looping;
import java.util.Scanner;

public class PerfectNumber{

    public static void isPerfect(int num){
        int sum = 0;
        for(int i = 1; i <num; i++){
            if(num%i==0)
            {
                sum = sum + i;
            }
        }

        if(sum==num){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not perfect");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        isPerfect(n);
        sc.close();
    }

}
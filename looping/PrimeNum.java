package looping;
import java.util.Scanner;
public class PrimeNum {
    public static void isPrime(int num)
    {
        if(num<2)
        {
            System.out.println("Not a Prime Number.");
            return;
        }
        boolean is=true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                is=false;
                break;    
            }
        }
        if(is){
            System.out.println(num+" is a prime Number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
        
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number=sc.nextInt();

        isPrime(number);
        sc.close();


    }
    
}

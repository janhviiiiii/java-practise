package looping;
import java.util.Scanner;
public class PronicNum {

    // @SuppressWarnings("unused")
    public static void isPronic(int num)
    {
        boolean is=false;

        for(int i=1; i*(i+1)<=num ;i++) //i=1 , till i*(i+1) //1*(1+1=2)<=num
        {
            if(i*(i+1)==num) //to check consecutive number product = entered number or not 
            //3*(3+1) -? 3*4=12==12
            { 
                is=true; //flag->true
                break; //if pronic break
            }
        }

        if(is)
        {
            System.out.println(num+" is pronic number"); //-if flag->true->pronic number
        }
        else
        {
            System.out.println(num+ " not a pronic number"); //if flag-> remains false-> not pronic
        }        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        isPronic(n);

        sc.close();

    }
    
}

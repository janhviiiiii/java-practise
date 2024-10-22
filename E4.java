import java.util.Scanner;
public class E4 {
    
    public static String IsEligible(int attended, int conducted)
    {
        String str="";
        int p=((attended) * 100/(conducted));
        // double p=(attended/conducted)*100; 
        System.out.println(p);
        if(p>=75)
        {
            str="Eligible";
        }
        else
        {
            str="Not Eligible";
        }

        return str;
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of class Attended : ");
        int a=sc.nextInt();
        System.out.print("Enter Total Number of class Conducted: ");
        int b=sc.nextInt();
        System.out.print(IsEligible(a,b));

        sc.close();
    }
}

import java.util.Scanner;

public class D1 {

    public static int isGreater(int a, int b)
    {
        int max=a>b?a:b;
        return max;
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Greater Number: "+isGreater(a,b));


        sc.close();
    }
}

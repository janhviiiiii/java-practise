import java.util.*;
public class E2 {

    public static String isPy(int a, int b, int c)
    {
        String str="";
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        int maxsq=max*max;
        if(maxsq==(a*a+b*b+c*c)-maxsq)
        {
            str="Pythagorean Triple";
        }
        else{
            str="Not Pythagorean Triple";
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();
        System.out.print(isPy(a,b,c));

        sc.close();
    }
    
}

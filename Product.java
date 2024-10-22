import java.util.*;
public class Product {
    public static double productOf(double a, double b)
    {
        double res =a*b;
        return res;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number1: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter Number2: ");
            double num2 = sc.nextDouble();

            System.out.println(num1+" * "+num2+" = "+productOf(num1, num2));
        }



    }
}

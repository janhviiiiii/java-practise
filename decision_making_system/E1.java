package decision_making_system;

import java.util.*;

public class E1 {

    public static String posNeg(int a) {
        String str = "";
        str = (a > 0 ? "Positive Number" : "Negative Number");

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print(posNeg(num));

        sc.close();
    }

}

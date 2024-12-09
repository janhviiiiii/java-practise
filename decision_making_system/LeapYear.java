package decision_making_system;
import java.util.*;

public class LeapYear {
    public static String lYear(int a) {
        String str = " ";
        str = ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) ? "Leap Year" : "Not Leap Year";
        return str;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Year: ");
            int year = sc.nextInt();

            System.out.println(year + " is " + lYear(year));
        }
    }
}

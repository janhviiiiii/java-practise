
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {

        int num;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.print("Reversed Number : " + rev);

    }

}

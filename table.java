import java.util.*;

public class table {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a number: ");
        int num;
        num = sc.nextInt();
        System.out.println("Table of " + num);

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }

        // while loop
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(num + "*" + i + "=" + num * i);
        // i++;
        // }

    }
}
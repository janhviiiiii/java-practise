package pattern;

import java.util.Scanner;

public class pyramid1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows/columns: ");
        int num = sc.nextInt();

        int count = num;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("*"+" ");
            }
            count--;
            // to move one below
            System.out.println();
        }
        sc.close();
    }

}

package looping;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int n;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter end point for fibo: ");
        n = sc.nextInt();

        // 0 1 1 2 3 5 8 13 21
        // a b c d e f g h i j
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;

            System.out.print(b + " ");
        }

    }

}
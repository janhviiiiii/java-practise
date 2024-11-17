package pattern;

import java.util.Scanner;

public class pyramid3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row/columns: ");
        int n = sc.nextInt();
        int count = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

               if(count>=j) {
                System.out.print(" "+" ");
               }
               else {
                System.out.print("*"+" ");
               }
            }
            count--;
            System.out.println();
        }
        sc.close();
    }
}

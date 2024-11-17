//hollow-left-pyramid
// *       
// * *     
// *   *   
// *     * 
// *   *   
// * *     
// *     
package pattern;

import java.util.Scanner;

public class pyramid4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int n1 = sc.nextInt();

        // System.out.print("Enter col: ");
        int n2 = (n1/2)+1;
        System.out.println();
        // int n1=5; //row 
        //  int n2=3; //col
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (j == 1 || i == j || i + j == n1 + 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

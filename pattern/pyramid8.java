//right-pyramid
//          *     
//       *  *   
//     * *  * 
//       *  * 
//          * 
package pattern;

import java.util.Scanner;

public class pyramid8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int r = sc.nextInt();
        int c = (2 * r) - 1;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == c || i + j == c + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}

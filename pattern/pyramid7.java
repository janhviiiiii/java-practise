//bottom-hollow-pyramid
//      *     
//    *   *   
//  * * * * * 
package pattern;
import java.util.Scanner;

public class pyramid7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= 2 * r - 1; j++) {
                if (j == r - i + 1 || j == r + i - 1 || i == r) {
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

package looping;
import java.util.Scanner;
public class DoWhileEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        // Using do-while to keep asking for numbers
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            
            if (num >= 0) {
                System.out.println("You entered: " + num);
            }
        } while (num >= 0);  // Loop until a negative number is entered
        
        System.out.println("Negative number entered. Program terminated.");
        
        sc.close();
    }
}

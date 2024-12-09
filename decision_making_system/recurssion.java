package decision_making_system;

import java.util.Scanner;

public class recurssion {
    // static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Number of Stars you need: ");
        int n = sc.nextInt();
        printStar(n);
        sc.close();
    }

    public static void printStar(int n) {
        // Base Continue to return / break from the called method to the caller method
        if (n == 0) {
            return; // return to main method
        }

        // System.out.println(++count); //to find out how many iterations takes place
        System.out.println("*");
        printStar(--n); // to decrement n by 1
    }
}

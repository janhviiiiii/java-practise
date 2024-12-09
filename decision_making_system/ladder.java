package decision_making_system;

public class ladder {
    public static void main(String[] args) {

        int marks = 97;
        // int marks = -1;

        if (marks >= 90 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("B+");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("B");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("C");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("D");
        } else if (marks >= 35 && marks <= 39) {
            System.out.println("E");
        } else if (marks >= 0 && marks <= 34) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
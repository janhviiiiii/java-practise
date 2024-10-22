public class pattern {
    public static void main(String[] args) {
        System.out.println("Pattern 1 ");

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // no of rows = 5
        for (int i = 1; i <= 5; i++) {
            // to print space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // to print *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
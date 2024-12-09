public class XylemNumber {

    public static void isXylem(int[] num) {

        int n = num.length;
        int sum1 = num[0] + num[n - 1];
        // to check
        // System.out.println(sum1);
        int sum2 = 0;

        for (int i = 1; i <= n - 2; i++) {
            sum2 = sum2 + num[i];
        }

        // System.out.println(sum2);
        if (sum1 == sum2) {
            System.out.println("It is a Xylem number");
        } else {
            System.out.println(" It is not a Xylem number");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 3, 0, 8, 5 };
        isXylem(arr);
    }
}

package looping;

public class arraySum {

    public static int Sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        System.out.println(Sum(a));
    }
}
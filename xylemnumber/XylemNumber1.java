public class XylemNumber1 {

    public static void isXylem(int num) {
        int originalNum = num;
        int firstNum = 0;
        int lastNum = 0;
        int sum1 = 0;
        int sumAll = 0;
        int sum2 = 0;

        lastNum = num % 10;
        // to check
        System.out.println("Last number: " + lastNum);

        while (num >= 10) {
            firstNum = num /= 10; // num/=10 -> num = num / 10
        }

        System.out.println("First number: " + firstNum);

        sum1 = firstNum + lastNum;
        System.out.println("Sum of first and last num: " + sum1);

        // using for loop
        // for(int i = originalNum; i != 0; i /= 10)
        // {
        // sumAll += i % 10;
        // }

        // using while loop
        int imod10 = 0;
        while (originalNum != 0) {
            imod10 = originalNum % 10;
            sumAll = sumAll + imod10;
            originalNum = originalNum / 10;
        }

        System.out.println("Sum of all numbers: " + sumAll);

        sum2 = sumAll - sum1;
        System.out.println("Sum of remaining num: " + sum2);

        if (sum1 == sum2) {
            System.out.println("It is a Xylem Number");
        }

        else {
            System.out.println("Not a Xylem Number");
        }
    }

    public static void main(String[] args) {
        isXylem(13215);
    }
}

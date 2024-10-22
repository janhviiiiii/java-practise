package looping;

public class PrintingNumbers {
    public static void printNum(int a, int b)
    {
        for(int i=a; i<=b; i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printNum(17,21);
    }
}

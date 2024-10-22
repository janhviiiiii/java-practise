public class printNo {
    public static void printNum(int a, int b)
    {
        for(int i=a; i<=b; i++)
        {
            System.out.println(i);
        }


        System.out.println("====================");
        int num=a;
        while(num<=b)
        {
            System.out.println(num);
            num++;
        }
    }
    public static void main(String[] args) {
        printNum(17,21);
    }
}

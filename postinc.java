public class postinc{
    public static void main(String[] args) {
        int a =10;
        a++;
        int b= a++;
        int c=a++ + b++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
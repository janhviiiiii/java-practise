package getset;

public class DriverBookBox
{
    public static void main(String[] args) {
        Book b1 = new Book();
        Box b2=new Box();

        myMethod1(b1);
        // System.out.println(myMethod1(b1));//myMethod1(b1);
        myMethod2(b2);
    }

    public static Book myMethod1(Book b1)
    {
        System.out.println(b1);
        return b1;
    }

    public static void myMethod2(Box b2)
    {
        System.out.println(b2);
        // return b2;
    }

    
}
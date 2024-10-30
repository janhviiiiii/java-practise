package getset;

public class Book1Driver {

    public static void myMethod(Book1 b, int d)
    {
        System.out.print("Final Price: ");
        System.out.println(b.price-(b.price*d/100));
    }

    public static void main(String[] args) {
        
        Book1 b1=new Book1("Iron flame", 1000);
        System.out.println("Original Price: "+b1.price);
        myMethod(b1, 10);

    }


    
}

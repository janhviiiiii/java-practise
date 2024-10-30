package getset;

public class PhoneDriver {

    public static void myMethod(Phone p)
    {
        System.out.println(p.name);
        System.out.println(p.ram);
    }

    public static void main(String[] args) {
        
        Phone p=new Phone("Samsung", 100000);

        myMethod(p);

    }
    
}

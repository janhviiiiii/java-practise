package inheritance;
//Parent class
public class Planet {

    //static variable
    static String name = "Planet";
    //static method
    public static void myStaticMethod()
    {
        System.out.println("Static Method");
    }
    //static initializer
    static {
        System.out.println("Static Initializer");
    }

    //non-static variable
    String gravity="gravity";

    //non-static method
    public void myNonStaticMethod()
    {
        System.out.println("Non Static Method");
    }

    //non-static initializer
    {
        System.out.println("Non-Static Initializer");
    }

    //constructor
    Planet()
    {
        System.out.println("Constructor");
    }

}

public class Demo3 {
    
    String name="hello";
    int watt=1;

    Demo3(String n, int w)
    {
        name=n;
        watt=w;
    }

    static
    {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Demo3 d= new Demo3("Light", 100);
        System.out.println("Name: "+d.name + " Watt: "+d.watt);
    }
}

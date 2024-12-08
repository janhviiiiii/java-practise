package inheritance;

class Planet1
{
    public static void show(){
        System.out.println("Galaxy");
    }
    static{
        System.out.println("Planet is loading");
    }
}

class Earth1 extends Planet1 {
    public static void atmosphere(){
        System.out.println("Oxygen");
    }
    static{
        System.out.println("Earth is loading");
    }
}

public class Driver1{
    public static void main(String[] args) {
        Earth1.show();
    }
}

public class print1{

    public static void main1(String[] args) {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println();
        // System.out.print(); //will give you compile time error
        main1(new String[1]);
    }
  

} 
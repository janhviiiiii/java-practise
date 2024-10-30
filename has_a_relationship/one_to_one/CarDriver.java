package has_a_relationship.one_to_one;

public class CarDriver {

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "model name 1");
        System.out.println(c1.name);
        System.out.println(c1.e.model);
        System.out.println("=============");
        Car c2 = new Car("Tata", "model name 2");
        System.out.println(c2.name);
        System.out.println(c2.e.model);   
    }
}

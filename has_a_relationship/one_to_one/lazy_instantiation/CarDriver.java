package has_a_relationship.one_to_one.lazy_instantiation;

public class CarDriver {

    public static void main(String[] args) {
        Car c1=new Car("BMW");
        System.out.println(c1.name);
        c1.details("model 1");
        System.out.println(c1.e.model);

        Car c2=new Car("Mercedes");
        System.out.println(c2.name);
        c2.details("model 2");
        System.out.println(c2.e.model);

    }
    
}

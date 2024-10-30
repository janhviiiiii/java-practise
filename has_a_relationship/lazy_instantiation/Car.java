package has_a_relationship.lazy_instantiation;

public class Car {

    String name;
    Engine e;

    Car(String name)
    {
        this.name=name;
    }

    public Engine details(String model)
    {
         e= new Engine(model);

        return e;        
    }    
}

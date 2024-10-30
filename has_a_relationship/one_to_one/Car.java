package has_a_relationship.one_to_one;

public class Car {

    String name;

    //achieving HAS -A 
    Engine e;

    Car(String name, String e) {
        this.name = name;
        this.e=new Engine(e);
    }

    
}

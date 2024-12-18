package polymorphism.method_overriding;

public class Dog implements Animal {

    @Override
    public void sound() {
       System.out.println("bark");
    }
    
}

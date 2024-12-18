package polymorphism.method_overriding;

public class AnimalDriver extends Cat{

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
    
}

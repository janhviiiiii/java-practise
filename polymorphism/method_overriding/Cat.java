package polymorphism.method_overriding;

public class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Meow");
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}

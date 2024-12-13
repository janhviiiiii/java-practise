package inheritance.multiple;

public class Child implements Parent1, Parent2 {

    @Override
    public void parent1Method() {
        System.out.println("Parent 1");
    }

    @Override // As the methods are overrided methods
    public void parent2Method() {
        System.out.println("Parent 2");
    }

}

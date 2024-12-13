package inheritance.heirarchical;

public class FamilyDriver {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.parentMethod();
        child1.child1Method();
        Child2 child2 = new Child2();
        child2.parentMethod();
        child2.child2Method();
    }
}

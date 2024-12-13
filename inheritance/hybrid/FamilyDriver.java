package inheritance.hybrid;

public class FamilyDriver {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.grandParentMethod();
        child1.parentMethod();
        child1.child1Method();
        Child2 child2 = new Child2();
        child2.grandParentMethod();
        child2.parentMethod();
        child2.child2Method();

    }
}

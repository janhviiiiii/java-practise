package inheritance.multi_level;

public class FamilyDriver {
    public static void main(String[] args) {
        Child child = new Child();
        child.grandParentMethod();
        child.parentMethod();
        child.childMethod();
        
    }
    
}

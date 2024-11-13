package has_a_relationship.one_to_many;

public class BagDriver {
    public static void main(String[] args) {
        String[] b = { "\tbook1", "\tbook2", "\tbook3" };
        System.out.println("Book Names: ");
        Bag b1 = new Bag("American Tourist", b);
        System.out.println("Bag Name: ");
        System.out.println("\t"+b1.bagName);
        // System.out.println(b1);
        // System.out.println(b1.bagName+b1.bookName.toString());

    }
}

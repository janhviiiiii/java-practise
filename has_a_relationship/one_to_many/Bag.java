package has_a_relationship.one_to_many;

public class Bag {
    String bagName;
    Book[] bookName = new Book[3];

    Bag(String bagName, String[] bookName) {
        this.bagName = bagName;
        for (int i = 0; i < bookName.length; i++) {
            this.bookName[i] = new Book(bookName);
        }

        for (int i = 0; i < bookName.length; i++) {
            System.out.println(bookName[i]);
        }
    }

}
package methodchaining;

public class PersonDriver {

    public static void main(String[] args) {
        Person p1=new Person("Janhvi", 21);
        p1.display();
        p1.setAge(18).display().setName("Janu").display();

        Person p2=new Person("Viraj", 21);
        p2.display();
        p2.setAge(18).display().setName("V").display();

    }   
}

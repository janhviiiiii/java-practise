package methodchaining;


public class StudentDriver
{
    public static void main(String[] args) {
        int[] a={30,60,10};
        Student s=new Student("Janhvi", a);

        // System.out.println(s.getName());
        // s.details();
        // s.totalMarks();
        // s.maxMarks();
        // s.minMarks();
        // s.average();

        //method chaining-> calling all the methods in one line only -> by returning the obj ref(address) in the method return statements.
       s.details().totalMarks().minMarks().maxMarks().average();
    }
    
}
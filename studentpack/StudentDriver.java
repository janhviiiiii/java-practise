package studentpack;

public class StudentDriver
{
    public static void main(String[] args) {
        int[] a={30,60,10};
        Student s=new Student("Janhvi", a);
        // System.out.println(s.getName());
        Students.details(s);
        System.out.println();
        Students.totalMarks(s);
        System.out.println();
        Students.maxMarks(s);
        System.out.println();
        Students.minMarks(s);
        System.out.println();
        Students.average(s);
    }
    
}
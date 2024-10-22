package studentpack;


public class Student
{
    private String name;
    private int[] marks;

    Student(String name, int[] marks)
    {
        this.name=name;
        this.marks=marks;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    // public void getMarks()
    // {
    //     // return Arrays.toString(marks);
    //     // int arr=0;
    //     for(int i=0; i<marks.length; i++)
    //     {
    //         System.out.print(marks[i]+ " ");


    //         // arr+=marks[i];
            
    //     }
    //     // return arr;
    // }

    public int[] getMarks()
    {
        return marks;
    }

    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
}
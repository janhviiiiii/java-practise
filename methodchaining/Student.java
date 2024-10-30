package methodchaining;

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

    public Student setName(String name)
    {
        this.name=name;
        return this;
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

    public Student setMarks(int[] marks)
    {
        this.marks=marks;
        return this;
    }

    
    public Student details()
    {
        System.out.println("\nDetails of Student:- ");
        System.out.print("Name: ");
        System.out.println(getName());
        System.out.print("Marks: ");
        for(int i=0; i<getMarks().length; i++)
        {
            System.out.print(getMarks()[i]+ " ");
        }
        return this;
    }

    public Student totalMarks()
    {
        System.out.print("\nTotal Marks: ");
        int sum=0;
        for(int i=0; i<getMarks().length; i++)
        {
            sum+=getMarks()[i];
        }
        System.out.print(sum);

        return this;
    }

    public Student maxMarks()
    {
        System.out.print("\nMaximum Marks: ");

        for(int i=0; i<getMarks().length; i++)
        {   
            for(int j=i+1; j<getMarks().length;j++)
            {
               int temp=0;
               if(getMarks()[i]>getMarks()[j])
               {
                    temp=getMarks()[i];
                    getMarks()[i]=getMarks()[j];
                    getMarks()[j]=temp;
               }
            }   
        }
        int len=getMarks().length-1;
        // System.out.println("length: "+len);
        System.out.print(getMarks()[len]);  

        return this;
    }

    public Student minMarks()
    {
        System.out.print("\nMinimum Marks: ");

        for(int i=0; i<getMarks().length; i++)
        {   
            for(int j=i+1; j<getMarks().length;j++)
            {
               int temp=0;
               if(getMarks()[i]>getMarks()[j])
               {
                    temp=getMarks()[i];
                    getMarks()[i]=getMarks()[j];
                    getMarks()[j]=temp;
               }
            }   
        }
        System.out.print(getMarks()[0]); 

        return this;
    }

    public Student average()
    {
        System.out.print("\nAverage Marks: ");
        int sum=0;
        for(int i=0; i<getMarks().length; i++)
        {
            sum+=getMarks()[i];
        }
        System.out.print(sum/getMarks().length);

        return this;
    }

}
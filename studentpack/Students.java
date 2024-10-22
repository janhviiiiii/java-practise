package studentpack;

public class Students {

    public static void details(Student s)
    {
        System.out.println("Deatils of Student: ");
        System.out.print("Name: ");
        System.out.println(s.getName());
        System.out.print("Marks: ");
        for(int i=0; i<s.getMarks().length; i++)
        {
            System.out.print(s.getMarks()[i]+ " ");
        }
    }

    public static void totalMarks(Student s)
    {
        System.out.print("Total Marks: ");
        int sum=0;
        for(int i=0; i<s.getMarks().length; i++)
        {
            sum+=s.getMarks()[i];
        }
        System.out.print(sum);
    }

    public static void maxMarks(Student s)
    {
        System.out.print("Maximum Marks: ");

        for(int i=0; i<s.getMarks().length; i++)
        {   
            for(int j=i+1; j<s.getMarks().length;j++)
            {
               int temp=0;
               if(s.getMarks()[i]>s.getMarks()[j])
               {
                    temp=s.getMarks()[i];
                    s.getMarks()[i]=s.getMarks()[j];
                    s.getMarks()[j]=temp;
               }
            }   
        }
        int len=s.getMarks().length-1;
        // System.out.println("length: "+len);
        System.out.print(s.getMarks()[len]);      
    }

    public static void minMarks(Student s)
    {
        System.out.print("Minimum Marks: ");

        for(int i=0; i<s.getMarks().length; i++)
        {   
            for(int j=i+1; j<s.getMarks().length;j++)
            {
               int temp=0;
               if(s.getMarks()[i]>s.getMarks()[j])
               {
                    temp=s.getMarks()[i];
                    s.getMarks()[i]=s.getMarks()[j];
                    s.getMarks()[j]=temp;
               }
            }   
        }
         System.out.print(s.getMarks()[0]); 
    }

    public static void average(Student s)
    {
        System.out.print("Average Marks: ");
        int sum=0;
        for(int i=0; i<s.getMarks().length; i++)
        {
            sum+=s.getMarks()[i];
        }
        System.out.print(sum/s.getMarks().length);
    }
    
}

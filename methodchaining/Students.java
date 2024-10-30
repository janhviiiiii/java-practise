package methodchaining;

public class Students {

    public Students details(Student s)
    {
        System.out.println("Deatils of Student: ");
        System.out.print("Name: ");
        System.out.println(s.getName());
        System.out.print("Marks: ");
        for(int i=0; i<s.getMarks().length; i++)
        {
            System.out.print(s.getMarks()[i]+ " ");
        }
        return this;
    }

    public Students totalMarks(Student s)
    {
        System.out.print("Total Marks: ");
        int sum=0;
        for(int i=0; i<s.getMarks().length; i++)
        {
            sum+=s.getMarks()[i];
        }
        System.out.print(sum);

        return this;
    }

    public Students maxMarks(Student s)
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

        return this;
    }

    public Students minMarks(Student s)
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

        return this;
    }

    public Students average(Student s)
    {
        System.out.print("Average Marks: ");
        int sum=0;
        for(int i=0; i<s.getMarks().length; i++)
        {
            sum+=s.getMarks()[i];
        }
        System.out.print(sum/s.getMarks().length);

        return this;
    }

    
}


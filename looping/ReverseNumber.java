package looping;

public class ReverseNumber {
    
    public static void rev(int a)
    {
        while(a!=0)
        {
            System.out.println(a);
            a--;

        }
        System.out.println("=========================");
        int b=10;
        for(int i=b; i>=0; i--)
        {
            System.out.println(i);
        }
        System.out.println("=========================");
        int c=10;
        do
        {
            System.out.println(c);
            c--;
        }
        while (c>=0);    
        
    }
    

    public static void main(String[] args) {
        rev(10);
    }
}


import java.util.*;
public class Location
{
    public static String loc(String gender, String maritialStatus, int age)
    {
        if(gender.equals("male") && maritialStatus.equals("single") && age<30)
        {
            return "City";
        }
        else if(gender.equals("male") && maritialStatus.equals("married") && (age>=30 || age<=40))
        {
            return "Town";
        }
        else if(gender.equals("female") && maritialStatus.equals("single") && age<25)
        {
            return "Village";
        }
        else if(gender.equals("female") && maritialStatus.equals("married") && age>25)
        {
            return "City";
        }
        else
        {
            return "Town";
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Gender (male or female): ");
            String g=sc.nextLine();
            System.out.print("Enter Maritial Status (single or married): ");
            String m=sc.nextLine();
            System.out.print("Enter Age: ");
            int a=sc.nextInt();

            System.out.print("Location is : "+loc(g,m,a));
        }
    }

}
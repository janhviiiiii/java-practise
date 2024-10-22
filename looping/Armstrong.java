package looping;

public class Armstrong {
    
    //Method to find the number of digits
    public static int countDigits(int num)
    {
        int count=0;
        // to calculate no. of digits
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }

    //method to find power 
    public static int power(int a, int b)
    {
        int result=1;
        for(int i=1; i<=b; i++)
        {
            result*=a;
        }
        return result;
    }

    //Method to find if num is armstrong or not
    public static boolean isArm(int num)
    {
        int copy=num;//making a copy to story the original Number
        int sum=0;
        //storing the num in the given number in digits variable
        int digits=countDigits(num); //will count the number of the digits present in num

        //to iterate and find the sum of one num^number of digits in a number+....
        while(num!=0)
        {
            int rem=num%10; // to access the last digit of number
            sum+=power(rem, digits); //last digit raised to the n(number of digit in the given number)
            num/=10; //now removing the last digit
        }

        //to compare
        if(copy==sum)
        {
            System.out.println(copy+" Armstrong Number ");
            return true;
        }

        else
        {
            System.out.println(copy+" NOT Armstrong Number ");
            return false;
        }
    }

    public static void main(String[] args) {

        isArm(153);
        isArm(123);
        isArm(1634);
        isArm(371);
                
    }
}

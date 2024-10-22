package looping;

public class lcm {
    
    public static int findLcm(int a, int b)
    {
        //first we will find min max from a & b
        int max=Math.max(a, b);
        int min=Math.min(a, b);

        //making res var to story the max*i(1,2,3,4...) value 
        int res=0; 
        // int count=0;
        //loop -> 1...break;
        for(int i=1; ;i++)
        {
            // count++;
            res=max*i;
            
            if(res%min==0)   //checking if the max*i % minimun ==0 ? -> if yes then we will stop the iteration
            {                
                break;
            }
        }
        // System.out.println("count: "+count);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findLcm(10, 20));
    }


}

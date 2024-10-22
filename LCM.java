import java.lang.Math;
public class LCM {

    public static int findLCM(int a , int b){
        
        
        int max = Math.max(a,b);
        int min = Math.min(a, b);

        int res = 0;
        for(int i = 1;  ;i++)
        {
            res=max*i;
            if(res%min==0)
            {
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(findLCM(24, 36));
    }
    


}

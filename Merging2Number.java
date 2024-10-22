public class Merging2Number {
    
    public static int merge(int a, int b)
    {
        int mergedNum = 0;
        int num2 = b;
        int count = 0;
        int res = 1;
        int res2 = 0;
        while(b!=0)
        {
            b=b/10;
            count++;
        }
        //System.out.println(count);

        
        for(int i = 1; i<=count; i++)
        {
            res=res*10;
        }
        //System.out.println(res);

        res2 = a*res;
        mergedNum = res2+num2;

        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + num2);
        System.out.print("Merged Number: " + mergedNum);
        return mergedNum;
    }

    public static void main(String[] args) {
        merge(24, 5);
    }
}

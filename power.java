public class power {

    public static double pow(int a, int b){

        double res = 1.0;
        for(int i = 1; i <= b; i++)
        {
            res = res * a;
        }

        
        return res;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
    }
    
}

public class FactorCount {
    public static int factorCount(int num){
        int count = 0;
        for (int i =1; i <=num; i++){
            if(num%i==0){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(factorCount(28));
    }
}

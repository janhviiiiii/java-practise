public class CountNum {
    public static int countNumber(int num){
        int count = 0;

        // while(num!=0){
        //     num=num/10;
        //     count++;
        // }
        for(int i = num ; i != 0; i /= 10 )
        {
            count++;
        }

        return count;
    }   
    public static void main(String[] args) {
        System.out.println(countNumber(1234));
    }
}

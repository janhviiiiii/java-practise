// 23 to 28
// -23 to -28
// 0 to -5
// 'A' to 'E'
// -123 to -118
// 'x' to 'u'



public class whileLoop{
    public static void main(String[] args) {
        
        int a = 23;
        while(a<=28){
            System.out.println(a);
            a++;
        }
        System.out.println("========================");

        int b = -23;
        while(b>=-28){
            System.out.println(b);
            b--;
        }
        System.out.println("========================");

        int c=0;
        while(c>=-5){
            System.out.println(c);
            c--;
        }
        System.out.println("========================");

        char d ='A';
        while(d<='E'){
            System.out.println(d);
            d++;
        }
        System.out.println("========================");

        int e = -123;
        while(e<=-118){
            System.out.println(e);
            e++;
        }
        System.out.println("========================");

        char f='x';
        while(f>='u'){
            System.out.println(f);
            f--;
        }
    }
}
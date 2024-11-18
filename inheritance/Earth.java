package inheritance;

public class Earth extends Planet{
    public static void main(String[] args) {
        //System.out.println(Planet.name);    //using ClassName as reference
        System.out.println(name);    

        myStaticMethod();

        Earth e = new Earth();
        
        System.out.println(e.gravity);
        // System.out.println(p.gravity);  
        e.myNonStaticMethod();
        

    }
}

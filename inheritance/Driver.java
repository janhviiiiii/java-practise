package inheritance;

class Planet { // Parent Class
    static int a = 10;

    int aa = 40;

}

class Earth extends Planet { // Child Class
    static int b=30;

    int bb = 50;
}

public class Driver { // Main class
    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        //STATIC MEMBERS


        System.out.println(Planet.a); // 10 //Parent classname as reference

        Planet p = new Planet();
        System.out.println(p.a); // 10 //Parent object as reference

        System.out.println(Earth.a); // 10 //Child Classname as reference

        Earth e = new Earth();
        System.out.println(e.a); // 10 //Child object as reference


        // System.out.println(Planet.b); //error

        // System.out.println(p.b); //error

        System.out.println(Earth.b);    //30 //Child Classname as reference

        System.out.println(e.b);    //30 //Child object reference

        //  NON-STATIC MEMEBERS

        // System.out.println(Planet.aa);  //error //parent classname reference

        System.out.println(p.aa);   //40 //parent object reference

        // System.out.println(Earth.aa);   //error //child classname reference

        System.out.println(e.aa);   //40 //child object reference

        // System.out.println(Planet.bb);   //error //parent classname reference

        // System.out.println(p.bb);   //error //parent object reference

        // System.out.println(Earth.bb);   //error //child classname reference

        System.out.println(e.bb);   //50 //child object reference


    }

}

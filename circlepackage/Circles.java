package circlepackage;
public class Circles {

    
    public static void calculateArea(Circle c)
    {   
        System.out.println(3.14*(c.getRadius()*c.getRadius())); //c.getRadius() to get radius
    }
    
    public static void calculatePerimeter(Circle c)
    {
        System.out.println(2*3.14*c.getRadius());
    }
}

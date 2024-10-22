package circlepackage;

public class CircleDriver {

    public static void main(String [] args)
    {
        // Create a Circle object with a radius of 4
        Circle c=new Circle(4);
        System.out.print("Radius: ");
        System.out.print(c.getRadius());
        System.out.println();
        System.out.print("Area of Circle: ");
        Circles.calculateArea(c);
        System.out.print("Perimeter of Circle: ");
        Circles.calculatePerimeter(c);
    }
    
}

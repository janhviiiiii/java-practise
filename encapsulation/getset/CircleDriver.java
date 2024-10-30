package getset;

public class CircleDriver {

    public static void main(String[] args) {
        
    Circle c=new Circle(4);
    System.out.println("Radius = "+c.getRadius());
    
    c.setRadius(5);
    System.out.println(" New Radius = "+c.getRadius());

    System.out.println("Area = "+c.calculateArea());
    System.out.println("Perimeter = "+c.calculatePerimeter());
    }
}

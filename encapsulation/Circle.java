package encapsulation;

public class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * (getRadius() * getRadius());
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * getRadius();
    }

}

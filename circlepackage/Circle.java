package circlepackage;

public class Circle {

    //radius declare
    private double radius;

    //constructor create
    Circle(double radius)
    {
        //data validation
        setRadius(radius);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        //data validation
        if(radius>0)
        {
            this.radius=radius;
        }
        
    }
    
}

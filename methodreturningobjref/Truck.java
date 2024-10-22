package methodreturningobjref;

public class Truck {

    String name;
    int noOfWheels;

    private static Truck instance;
    
    private Truck(String name, int noOfWheels)
    {
        this.name=name;
        this.noOfWheels=noOfWheels;
    }

    

    public static Truck details(String name, int noOfWheels)
    {
        // Truck t=new Truck(name, noOfWheels);
        // return t;
        
        if(instance == null)
        {
            instance = new Truck(name, noOfWheels);
        }

        instance.name=name;
        instance.noOfWheels=noOfWheels;
       
        return instance;
    }
    
}

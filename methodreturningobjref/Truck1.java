package methodreturningobjref;

public class Truck1 {
    String name;
    int noOfWheels;

    // static Truck1 t;
    static int count;

    //array
    static Truck1[] tr=new Truck1[3];

    
    private Truck1(String name, int noOfWheels)
    {
        this.name=name;
        this.noOfWheels=noOfWheels;
    }

    public static Truck1 details(String name, int noOfWheels)
    {
        
        if(count < 3)
        {
            tr[count] = new Truck1(name, noOfWheels);
            System.out.println("Name: "+tr[count].name);  //will display name 
            System.out.println("No of wheels: "+tr[count].noOfWheels);  //will display the no. of wheels
            count++;     //incrementing the count
            // System.out.println("Count: "+count);  //printing incremented count value
            
            //returning the object type data stored inside the array
            return tr[count-1]; //tr[0], tr[1], tr[2], ..out of if 
        }
        
        else
        {
            System.out.println("invalid");
            return null; //returning null if it exceeds the limit
        }       
        
    }
    
}

package methodreturningobjref;

public class TruckDriver {
    public static void main(String[] args) {
        
        Truck t1=Truck.details("Ashok", 6); //will store address.
        System.out.println(t1);
        System.out.println("Name: "+t1.name+ "\nNo of wheels: "+t1.noOfWheels);

        Truck t2=Truck.details("Toyota", 8); //will store address.
        System.out.println(t1);
        System.out.println("Name: "+t2.name+ "\nNo of wheels: "+t2.noOfWheels);
    }
}

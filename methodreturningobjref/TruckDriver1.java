package methodreturningobjref;

public class TruckDriver1 {
    public static void main(String[] args) {
        
        Truck1 t1=Truck1.details("Ashok", 6); //will store address.
        System.out.println("address: "+t1);
        // System.out.println("Name: "+t1.name+ "\nNo of wheels: "+t1.noOfWheels);

        Truck1 t2=Truck1.details("Toyota", 8); //will store address.
        System.out.println("address: "+t2);
        // System.out.println("Name: "+t2.name+ "\nNo of wheels: "+t2.noOfWheels);

        Truck1 t3=Truck1.details("Tata", 12); //will store address.
        System.out.println("address: "+t3);
        // System.out.println("Name: "+t3.name+ "\nNo of wheels: "+t3.noOfWheels);

        Truck1 t4=Truck1.details("Ash", 6); //will store address.
        System.out.println("address: "+t4);
        // System.out.println("Name: "+t4.name+ "\nNo of wheels: "+t4.noOfWheels);
    }
    
}

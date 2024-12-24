package car_engine_selection.model;

public class PetrolEngine implements Engine{ //used inheritance by using is-A relationship

	@Override
	public void engineCheck() { //override method (abstract method implementation) ->Polymorphism
		System.out.println("Petrol Engine");
	}
	

}

package car_engine_selection.model;

public class DieselEngine implements Engine{ //used inheritance by using is-A relationship ->Inheritance

	@Override
	public void engineCheck() { //override method (abstract method implementation) ->Polymorphism
		System.out.println("Diesel Engine");
		
	}

}

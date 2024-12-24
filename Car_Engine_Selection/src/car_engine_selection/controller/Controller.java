package car_engine_selection.controller;

import car_engine_selection.model.Car;
import car_engine_selection.model.DieselEngine;
import car_engine_selection.model.PetrolEngine;

public class Controller {
	static Car car = new Car();
	
	public Car fitPetrolEngine() {
		PetrolEngine petrolEngine = new PetrolEngine();
		car.setEngine(petrolEngine); //to set Petrol Engine
		return car; 
	}
	
	public Car fitDieselEngine() {
		DieselEngine dieselEngine = new DieselEngine();
		car.setEngine(dieselEngine); //to set Diesel Engine
		return car;
	}

}

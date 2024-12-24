package car_engine_selection.model;

public class Car { //dependent class provide contentment to engine
	private Engine engine; //encapsulation and provide getter setter methods
	
	public Engine getEngine() { //getter method
		return engine;
	}
	public void setEngine(Engine engine) { //setter method
		this.engine = engine;
	}
}
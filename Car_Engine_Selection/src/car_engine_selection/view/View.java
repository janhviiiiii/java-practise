package car_engine_selection.view;
import java.util.Scanner;

import car_engine_selection.controller.Controller;
import car_engine_selection.model.Car;

public class View {
	static {
		System.out.println("--- Welcome to TATA Motors ---");
	}

	static Scanner userInput = new Scanner(System.in);
	static Car car;
	static Controller controller = new Controller();

	public static void main(String[] args) {

		boolean askAgain = false; // flag to consider repetition

		do {
			askAgain = false;
			try {
				System.out.println("Which engine do you want to fit in your car?");
				System.out.println("1. Petrol Engine\n2. Diesel Engine");
				System.out.println("Enter number respective to desired engine");
				byte userChoice = userInput.nextByte();
				userInput.nextLine();
				switch (userChoice) {
				case 1:
					car = controller.fitPetrolEngine(); // car -> Car datatype variable here.
														// controller.fitPetrolEngine() method will get called if user
														// select 1 for Petrol Engine
					break;
				case 2:
					car = controller.fitDieselEngine(); // car -> Car datatype variable here.
														// controller.fitDieselEngine() method will get called if the
														// user select 2 for Diesel Engine
					break;

				default:// if the userInput is not matching with the options provided
					System.out.println("Invalid selection. Please try again.");
					askAgain = true; // flag->true
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid input. Please enter a number (1 or 2).");
				userInput.nextLine();
				askAgain = true; // setting flag to repeat the loop

			}
		} while (askAgain);

		car.getEngine().engineCheck(); // car.getEngine()->address.engineCheck() method call-> will return msg
										// regarding engine

	}

}

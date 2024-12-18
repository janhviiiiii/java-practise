package calculator;

import java.util.Scanner;

public class CalculatorDriver {
	static Scanner sc = new Scanner(System.in);
	static Calculator calculator = new Calculator();

	public static void main(String[] args) {
		System.out.println("---MENU DRIVEN CALCULATOR---\n");

		do {
			System.out.println("Choose an operation to perform: \n" + "Enter 1 for Addition\n"
					+ "Enter 2 for Subtraction\n" + "Enter 3 for Multiplication");
			char userChoice = sc.next().charAt(0);

			doOperation(userChoice);
			
			System.out.println("Do you want to do more operation? [y/n]: ");
		} while (sc.next().charAt(0) == 'y'); //toContiue
		
		System.out.println("Thank you for using calculator!");
	}

	private static void doOperation(char userChoice) {
		calculator.reset(); // clearing previous numbers
		System.out.println("Enter numbers to operate on (Enter 'done' to finish)");

		while (sc.hasNextDouble()) {
			calculator.addNumbers(sc.nextDouble());
		}
		sc.next(); // to consume done

		double result;

		switch (userChoice) {
		case '1':
			result = calculator.add();
			break;
		case '2':
			result = calculator.subtract();
			break;
		case '3':
			result = calculator.multiply();
			break;
		default:
			System.out.println("Invalid Choice!");
			return;
		}
		System.out.println("Result = " + result);
	}
}
package calculator;

import java.util.Scanner;

public class CalculatorDriver {
	static Scanner sc = new Scanner(System.in);
	static Calculator calculator = new Calculator();

	public static void main(String[] args) {

		System.out.println("--- MENU DRIVEN CALCULATOR ---\n");
	
		System.out.println("Choose an operation to perform: \n" 
				+ "Enter 1 for Addition\n" 
				+ "Enter 2 for Subtraction\n"
				+ "Enter 3 for Multiplication");
		char userChoice = sc.next().charAt(0);
		
		System.out.println("Enter Numbers to operate on (Enter 'done' to finish): ");
		while(sc.hasNextDouble()) {
			calculator.addNumbers(sc.nextDouble());
		}
		sc.next(); //to consume "done"

		double result = 0;
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

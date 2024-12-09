package decision_making_system;

import java.util.*;

class Vote {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.print("Eligible to Vote");
		} else {
			System.out.print("Not Eligible to Vote");
		}

		sc.close();
	}
}
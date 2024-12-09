package decision_making_system;

import java.util.*;

class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		System.out.println("Number = " + num);

		if (num % 2 == 0) {
			System.out.println(num + " is an EVEN NUMBER");

		} else {
			System.out.println(num + " is an ODD NUMBER");

		}

		sc.close();
	}
}
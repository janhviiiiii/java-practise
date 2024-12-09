package decision_making_system;

import java.util.*;

class Triangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st angle in degree number: ");
		int d1 = sc.nextInt();
		System.out.print("Enter 2st angle in degree number: ");
		int d2 = sc.nextInt();
		System.out.print("Enter 3st angle in degree number: ");
		int d3 = sc.nextInt();

		if (d1 + d2 + d3 == 180) {
			System.out.println("It is a triangle");
		} else {
			System.out.println("It is NOT a triangle");

		}
		sc.close();
	}

}
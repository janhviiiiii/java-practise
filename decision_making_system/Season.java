package decision_making_system;

import java.util.*;

class Season {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month number: ");
		int num = sc.nextInt();

		sc.close();

		switch (num) {
			case 2:
				System.out.print("Summer");
				break;
			case 3:
				System.out.print("Summer");
				break;
			case 4:
				System.out.print("Summer");
				break;
			case 5:
				System.out.print("Summer");
				break;

			case 6:
				System.out.print("Rainy");
				break;
			case 7:
				System.out.print("Rainy");
				break;
			case 8:
				System.out.print("Rainy");
				break;
			case 9:
				System.out.print("Rainy");
				break;

			case 10:
				System.out.print("Winter");
				break;
			case 12:
				System.out.print("Winter");
				break;
			case 11:
				System.out.print("Winter");
				break;
			case 1:
				System.out.print("Winter");
				break;

			default:
				System.out.print("enter valid number.");
				break;

		}
	}

}
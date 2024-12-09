package decision_making_system;

import java.util.*;

class TraingleTypeChecker {
	public static String type(int ab, int bc, int ca) {

		if (ab == bc && ab == ca && ab == ca) {
			return "Equilateral";
		} else if ((ab == bc) || (ab == ca) || (bc == ca)) {
			return "Isosceles";
		} else {
			return "Scalene";
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ab: ");
		int num1 = sc.nextInt();
		System.out.print("Enter bc: ");
		int num2 = sc.nextInt();
		System.out.print("Enter ca: ");
		int num3 = sc.nextInt();

		System.out.print("Type of triangle: " + type(num1, num2, num3));

		sc.close();
	}
}
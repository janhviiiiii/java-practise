package decision_making_system;

import java.util.*;

class FineCalci {
	public static String toCalc(int a) {
		/*
		 * if(a<=60)
		 * {
		 * return "No fine";
		 * }
		 * else if(a>=61 && a<=80)
		 * {
		 * return "Small fine";
		 * }
		 * else
		 * {
		 * return "Heavy fine";
		 * }
		 */

		return (a <= 60) ? "no fine" : ((a >= 61 && a <= 80) ? "small fine" : "heavy fine");

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter speed: ");
		int speed = sc.nextInt();

		System.out.print(toCalc(speed));

		sc.close();
	}
}
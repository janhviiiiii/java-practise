package decision_making_system;

import java.util.*;

class DenominatorCalc {
	public static void toCalc(int a) {
		int count2k = 0;
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;

		if (a >= 2000) {
			count2k = a / 2000;
			a %= 2000;
			System.out.print("no of 2000 notes: " + count2k + "\n");
		}
		if (a >= 500) {
			count500 = a / 500;
			a %= 500;
			System.out.print("no of 500 notes: " + count500 + "\n");

		}
		if (a >= 100) {
			count100 = a / 100;
			a %= 100;
			System.out.print("no of 100 notes: " + count100 + "\n");
		}
		if (a >= 50) {
			count50 = a / 50;
			a %= 50;
			System.out.print("no of 50 notes: " + count50 + "\n");
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount: ");
		int amt = sc.nextInt();

		if (amt % 50 != 0) {
			System.out.print("Amt should be divisible by 50");
		} else {
			toCalc(amt);
		}

		sc.close();
	}
}
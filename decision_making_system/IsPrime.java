package decision_making_system;

import java.util.*;

class IsPrime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println("count: " + count);
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.print("Not a prime number");

		}

		sc.close();
	}
}
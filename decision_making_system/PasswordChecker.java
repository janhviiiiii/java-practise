package decision_making_system;

import java.util.*;

class PasswordChecker {
	public static String toCheck(String str) {
		/*
		 * if(str.length()<6)
		 * {
		 * return "weak";
		 * }
		 * else if(str.length()>=6 && str.length()<=12)
		 * {
		 * return "Medium";
		 * 
		 * }
		 * else
		 * {
		 * return "Strong";
		 * }
		 */
		return (str.length() < 6) ? "Weak" : (str.length() >= 6 && str.length() <= 12 ? "Medium" : "Strong");

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password: ");
		String p = sc.nextLine();

		System.out.print("Password is: " + toCheck(p));

		sc.close();
	}
}
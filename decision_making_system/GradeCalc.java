package decision_making_system;

import java.util.*;

class GradeCalc {
	public static String grade(int a) {
		String str = " ";
		if (a > 90) {
			str = "Grade A";
		} else if (a > 80 && a <= 90) {
			str = "Grade B";
		} else if (a > 70 && a <= 80) {
			str = "Grade C";
		} else if (a > 60 && a <= 70) {
			str = "Grade D";
		} else if (a < 0) {
			str = "Enter valid marks";
		} else {
			str = "Grade F";
		}
		return str;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		System.out.println(grade(marks));

		sc.close();
	}
}
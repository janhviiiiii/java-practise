package decision_making_system;

import java.util.*;

class LargestOfThree {
	public static int LargeNum(int a, int b, int c) {
		int max;
		// max = Math.max(Math.max(a,b),c);
		// return max;
		// if(a>b && a>c)
		// {
		// max=a;
		// }
		// else if(b>c && b>a)
		// {
		// max=b;
		// }
		// else
		// {
		// max=c;
		// }

		max = a > b ? (a > c ? a : c) : (b > c ? b : c);

		return max;

	}

	public static void main(String args[]) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		n1 = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		n2 = sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		n3 = sc.nextInt();

		System.out.println("largest Number from " + n1 + ", " + n2 + ", " + n3 + " is " + LargeNum(n1, n2, n3));

		sc.close();
	}
}
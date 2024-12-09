package decision_making_system;

import java.util.Scanner;

public class IsNumberOrCharacter {
    public static String isChar(char ch) {
        String str = "";
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            str = "Character";
        } else if (ch >= '0' && ch <= '9') {
            str = "Number";
        } else {
            str = "Special Character";
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char a = sc.next().charAt(0);

        System.out.print(isChar(a));

        sc.close();
    }
}

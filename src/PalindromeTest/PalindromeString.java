package PalindromeTest;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String...");
		String str = sc.nextLine();

		String rev = "";
		String org_str = str;

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}

		System.out.println("Reversed String is : " + rev);

		if (org_str.equals(rev)) {

			System.out.println(org_str + " is a palindrome string");
		}

		else {

			System.out.println(org_str + " is not a palindrome string");

		}
	}

}

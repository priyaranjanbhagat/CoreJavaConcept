package ReverseString;

import java.util.Scanner;

public class UsingConcatenation {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");

		String str = sc.nextLine();

		// System.out.println("You have entered : " + str);

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println("Reverse string is : " + rev);
	}

}

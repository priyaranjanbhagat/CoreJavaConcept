package PalindromeTest;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");

		int num = sc.nextInt();

		int org_num = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;

			num = num / 10;

		}

		System.out.println("Reversed number is : " + rev);

		if (org_num == rev) {

			System.out.println("Reversed number is a palindrome number");
		}

		else {

			System.out.println("Reversed number is not a palindrome number");
		}

	}

}

package ReverseString;

import java.util.Scanner;

public class UsingCharacterArray {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");

		String str = sc.nextLine();

//		System.out.println("You have entered the String : " + str);

		String rev = "";
		char[] a = str.toCharArray();
		int len = a.length;
		System.out.println("Lenght of the entered string is : " + len);

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + a[i];
		}

		System.out.println("Reversed String is : " + rev);
	}

}

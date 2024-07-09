package ReverseString;

import java.util.Scanner;

public class UsingStringBuffer {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");

		String str = sc.nextLine();

		System.out.println("You have entered the String : " + str);

		System.out.print("Press Y to reverse your string : ");
		sc.nextLine();

		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println("Reversed String is : " + rev);
	}

}

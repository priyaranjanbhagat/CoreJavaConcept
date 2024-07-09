package ReverseNumber;

import java.util.Scanner;

public class UsingStringBuffer {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number : ");

		int num = sc.nextInt();

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();

		System.out.println("Reverse number is : " + rev);
	}

}

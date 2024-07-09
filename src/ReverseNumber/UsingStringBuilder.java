package ReverseNumber;

import java.util.Scanner;

public class UsingStringBuilder {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number : ");

		int num = sc.nextInt();

		StringBuilder sbl = new StringBuilder();

		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse number is :" + rev);

	}

}

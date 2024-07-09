package LargestNumber;

import java.util.Scanner;

public class UsingTernaryOperator {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int a = sc.nextInt();

		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();

		System.out.print("Enter Third Number : ");
		int c = sc.nextInt();

//		int largest1 = a > b ? a : b;
//		int largest2 = c > largest1 ? c : largest1;

		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);

		System.out.println(largest + " is the largest number");
	}

}

package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0)
					count++;

			}

			if (count == 2) {
				System.out.println(num + " is a Prime number");
			}

			else {

				System.out.println(num + " is not a Prime number");
			}

		}

		else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}

package CountNumber;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to Count Even And Odd Digits : ");

		int num = sc.nextInt();

		int even_count = 0;
		int odd_count = 0;

		while (num > 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				even_count++;
			}

			else {

				odd_count++;
			}

			num = num / 10;

		}

		System.out.println("Total even count in digits is : " + even_count);
		System.out.println("Total odd count in digits is " + odd_count);
	}

}

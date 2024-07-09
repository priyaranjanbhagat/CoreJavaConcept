package FactorialNumber;

import java.util.Scanner;

public class FactorialNumberTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();

		long factorial = 1;

		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;

		}

		System.out.println("The factorial of the num is : " + factorial);

	}

}

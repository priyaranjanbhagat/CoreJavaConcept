package FactorialNumber;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();

		long factorial = 1;

		for (int i = num; i >= 1; i--) {

			factorial = factorial * i;
		}

		System.out.println("The factorial of number is : " + factorial);
	}

}

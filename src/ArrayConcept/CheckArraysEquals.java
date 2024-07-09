package ArrayConcept;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6 };

		/**************** Using Arrays class and equals() method *****************/
//		boolean status = Arrays.equals(a, b);
//
//		if (status == true) {
//
//			System.out.println("Arrays A and B Are Equal");
//		}
//
//		else {
//
//			System.out.println("Arrays A and B Are Not Equal");
//		}

		/**************** Using Own Logic *****************/
		boolean status = true;
		if (a.length == b.length) {

			for (int i = 0; i <= a.length - 1; i++) {

				if (a[i] != b[i]) {

					status = false;
				}
			}
		}

		else {

			status = false;

		}

		if (status == true) {

			System.out.println("Arrays A and B Are Equal");
		}

		else {
			System.out.println("Arrays A and B Are Not Equal");
		}

	}

}

package ArrayConcept;

public class EvenOddNumbersInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Even numbers in Array...");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}

		}

		System.out.println("Odd Numbers in Array...");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				System.out.println(a[i]);

			}

		}

		/************** Enhanced For Loop ******************/

		/*
		  for (int value : a) {
		  	if (value % 2 == 0) {		  
		  System.out.println(value); 
		  	} 
		  }
		 */

	}

}

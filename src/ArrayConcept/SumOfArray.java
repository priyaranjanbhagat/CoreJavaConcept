package ArrayConcept;

public class SumOfArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 8, 9, 5, 4, 3, 2 };

		int sum = 0;

//		for (int i = 0; i <= a.length - 1; i++) {
//
//			sum = sum + a[i];
//		}

		/******************* Using Enhanced for loop ***********************/

		for (int element : a) {

			sum = sum + element;

		}
		
		
		System.out.println("Sum of the given array is : " + sum);
	}

}

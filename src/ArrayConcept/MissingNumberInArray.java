package ArrayConcept;

public class MissingNumberInArray {

	public static void main(String... s) {

		// Array should not have duplicates
		// Array no need to be in sorted order
		// Value should be in Range

		int a[] = { 1, 2, 4, 5, 6, 7, 8 };
		int sum1 = 0;
		for (int i = 0; i <= a.length - 1; i++) {

			sum1 = sum1 + a[i];

		}

		System.out.println("Sum of elements in Array is : " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 8; i++) {

			sum2 = sum2 + i;
		}

		System.out.println("Sum of Range of Elements in Array is :" + sum2);

		System.out.println("Missing number in Array is : " + (sum2 - sum1));
	}

}

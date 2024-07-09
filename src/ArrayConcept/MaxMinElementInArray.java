package ArrayConcept;

public class MaxMinElementInArray {

	public static void main(String[] args) {

		int a[] = { 9, 50, 840, 80, 120, 400 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max)

				max = a[i];
		}

		System.out.println("Maximum value of an element in an Array is : " + max);

		int min = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] < min)
				min = a[i];
		}

		System.out.println("Minimum value of an element in an Array is : " + min);

	}

}

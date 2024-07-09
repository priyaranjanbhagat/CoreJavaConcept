package ArrayConcept;

public class DuplicateElementsInArray {

	public static void main(String... s) {

		int[] a = new int[] { 1, 2, 4, 6, 7, 8, 9, 4 };
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println("Duplicate element is available : " + a[i]);
					flag = true;
				}
			}

		}

		if (flag == false) {

			System.out.println("Duplicate element not found in the array");
		}

	}

}

package ArrayConcept;

import java.util.HashSet;

public class DuplicateElementsUsingHasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "java", "python", "c", "c++", "java", "c++" };

		HashSet<String> hs = new HashSet();

		boolean flag = false;

		for (String list : str) {

			if (hs.add(list) == false) {

				System.out.println("Duplicate element is found in the Array : " + list);

				flag = true;
			}

		}

		if (flag == false) {
			System.out.println("Duplicate element not found in the Array");
		}
	}

}

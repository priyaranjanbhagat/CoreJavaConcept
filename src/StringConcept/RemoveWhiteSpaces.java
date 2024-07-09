package StringConcept;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "Java      Selenium A  utomation Test   ing";
		str = str.replaceAll("\\s", "");

		System.out.println("After removing all spaces : " + str);
	}

}

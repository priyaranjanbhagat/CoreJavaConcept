package StringConcept;

public class CountCharacterOccurence {

	public static void main(String[] args) {

		String str = "Java Selenium Software Automation Testing";

		int totalCount = str.length();

		int totalCount_AfterRemove = str.replace("S", "").length();

		int count = totalCount - totalCount_AfterRemove;

		System.out.println("Number occurence is : " + count);

	}

}

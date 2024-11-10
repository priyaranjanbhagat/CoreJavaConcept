package StringConcept;

public class StringCompression {

	public static void main(String[] args) {
		String input = "aaabbbbcccccdddddd";
		StringBuilder output = new StringBuilder();

		int count = 1; // Initialize count of characters

		for (int i = 1; i < input.length(); i++) {

			// Check if the current character is the same as the previous one
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			}

			else {
				// Append character and count, then reset count
				output.append(input.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		// Append the last character and its count
		output.append(input.charAt(input.length() - 1)).append(count);

		System.out.println("Output: " + output.toString());
	}

}

package StringConcept;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
	
		
		String s = "%$@ Software &(/. Testing *><;~!@##$ Engineer";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}

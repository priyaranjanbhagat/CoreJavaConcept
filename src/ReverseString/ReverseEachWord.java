package ReverseString;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		String str = sc.nextLine();
		
		String[] splittedString = str.split(" ");
		
		String reverseString = "";
		
		for(String word : splittedString)
		{
			
			String reverseWord = "";
			
			for(int i = word.length()-1; i>=0; i--)
			{
				reverseWord = reverseWord + word.charAt(i);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		
		System.out.println("Reverse String is : " + reverseString);
	}

}

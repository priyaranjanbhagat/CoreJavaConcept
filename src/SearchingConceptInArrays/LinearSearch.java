package SearchingConceptInArrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to Search : ");
		int search_ele = sc.nextInt();

		int[] elements = { 20, 40, 90, 50, 30 };
		boolean flag = false;
		
		for(int i =0; i < elements.length; i++)
		{
			if(search_ele == elements[i])
			{
				System.out.println("Element found at position : " + i);
				flag = true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found in the Array");
		}

	}

}

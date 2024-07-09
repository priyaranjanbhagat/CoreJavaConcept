package SwappingNumbers;

public class UsingAddSub {

	public static void main(String... s) {
		int a = 20;
		int b = 30;

		System.out.println("Value of A is : " + a);
		System.out.println("Value of B is : " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping the value of A is : " + a);
		System.out.println("After swapping the value of B is : " + b);
		
	}

}

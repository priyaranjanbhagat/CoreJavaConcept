package SwappingNumbers;

public class BitwiseXOR {

	public static void main(String... s) {

		int a = 40;
		int b = 60;

		System.out.println("The value of A is : " + a);
		System.out.println("The value of B is : " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After Swapping, The value of A is : " + a);
		System.out.println("After Swapping, The value of B is : " + b);
	}

}

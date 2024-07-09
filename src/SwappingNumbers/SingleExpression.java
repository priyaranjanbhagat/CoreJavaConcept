package SwappingNumbers;

public class SingleExpression {

	public static void main(String... s) {

		int a = 30, b = 40;

		System.out.println("The value of A is : " + a);
		System.out.println("The value of B is : " + b);

		b = a + b - (a = b);

		System.out.println("After swapping, the value of A is : " + a);
		System.out.println("After swapping, the value of B is : " + b);

	}

}

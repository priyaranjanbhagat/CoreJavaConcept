package SwappingNumbers;

public class UsingMulDiv {

	public static void main(String... s) {

		int a = 10, b = 20;

		System.out.println("The value of A is : " + a);
		System.out.println("The value of B is : " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swapping the value of A is : " + a);
		System.out.println("After swapping the value of B is : " + b);

	}

}

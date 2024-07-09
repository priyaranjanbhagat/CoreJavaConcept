package SwappingNumbers;

public class UsingThirdVariable {

	public static void main(String... s) {

		int a = 20, b = 50;

		System.out.println("The value of A is : " + a);
		System.out.println("The value of B is : " + b);

		// Logic 1 --- Swapping using third variable

		int t = a;
		a = b;
		b = t;

		System.out.println("After swapping the value of A is : " + a);
		System.out.println("After swapping the value of B is : " + b);

	}

}

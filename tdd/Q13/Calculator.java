package Q13;

public class Calculator {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int substraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int division(int a, int b) {
		int result = a / b;
		if (b == 0) {
			System.out.println("second parameter should not be 0 for division");
			throw new ArithmeticException();
		} else
			return result;
	}

	public static int modulus(int a, int b) {
		int result = a % b;
		if (b == 0) {
			System.out.println("second parameter should not be 0 for modulus");
			throw new ArithmeticException();
		} else
			return result;
	}

	public static int power(int num, int power) {
		if (power > 0)
			return (int) Math.pow(num, power);
		else {
			System.out.println("power should be positive");
			throw new ArithmeticException();
		}

	}

	public static int squareRoot(int num) {
		return (int) Math.sqrt(num);
	}

	public static int cubeRoot(int num) {
		return (int) Math.cbrt(num);
	}


}

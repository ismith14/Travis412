package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		try {
			return a/b;
		}catch (ArithmeticException e)
		{
			return 0;
		}
	}
}

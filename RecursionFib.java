package Exercises;

public class RecursionFib {

	public static void main(String[] args) {
		System.out.print(fibonacci(7));

	}
	public static int fibonacci(int fib) {
		
		
		if (fib <= 0) {
			return 0;
		}
		else if (fib == 1) {
			return 1;
		}
		else {
			return (fibonacci(fib-1) + fibonacci(fib-2));
		}
		
		
	}

}

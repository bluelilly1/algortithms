package Exercises;

public class intToString {
	public static void main(String[] args) {
		int num = 1023;
		String num2 = " ";
		while (num != 0) {
			int remainder = num % 10;
			
			num2 = (char)(48+ remainder) + num2;
			num /= 10;
			
		}
		
		System.out.println(num2);
	}

}

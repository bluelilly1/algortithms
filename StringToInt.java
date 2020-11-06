package Exercises;


public class StringToInt {
	public static void main(String[] args) {
		String num = "1024";
		int counter = 1;
		int placeholder = 1;
		
		while (counter < 4) {
			placeholder *= 10;
			counter++;
		}
		
		counter = 0;
		int result = (num.charAt(counter)-'0') * placeholder;
		counter++;
		while (counter < 4) {
			placeholder /= 10;
			result += (num.charAt(counter)-'0') * placeholder;
			
			counter++;
			
		
		}
		
		System.out.print(result);
		
	}
}

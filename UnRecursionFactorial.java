package Exercises;

public class UnRecursionFactorial {
	 public static void main(String[] args) {
		    System.out.println(unRecursion(4));
		  }
	

	
	public static int unRecursion(int factorial) {
		int counter  = factorial;
		while (counter > 1) {
			counter --;
			factorial *= counter;
			
			
		}
		return factorial;
	}
		 

}

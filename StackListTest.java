package Exercises;

class StackListTest {
	  public static void main(String[] args)
	  {
	    StackList stack = new StackList();

	    stack.push(5);
	    stack.push(3);
	    stack.push(2);
	    stack.push(9);

	    System.out.format("The last value pushed was %d\n", stack.top());

	    while (!stack.isEmpty())
	    {
	      System.out.format("Popping %d\n", stack.pop());
	    }
	  }
	}
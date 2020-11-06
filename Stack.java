package Exercises;

class Stack
{
  // Hard code the size for now.
  private int[] stack = new int[10];
  private int pointer =  0;

  public void push(int value)
  {
	  
	  	  if (pointer > stack.length - 1) {
		  int[] newStack = new int[pointer+5];
		 
		  //add all elements into new stack
		  newStack = stack.clone();
		  stack = newStack;
	  }
	  	stack[pointer] = value;

	  pointer++;
  
  }
  public int pop()
  {
   int result = stack[stack.length-1];
   int[] newStack = new int[stack.length-1];
   for (int i = 0; i < stack.length; i++) {
	   newStack[i] = stack[i];
	   
   }
   stack = newStack;
   return result;
  }

  public int top()
  {
    return stack[stack.length-1];
  }

  public boolean isEmpty()
  {
    if (pointer == 0 ) {
    	return true;
    }
    else {
    	return false;
    }
  }
}
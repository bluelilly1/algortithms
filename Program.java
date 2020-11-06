package Exercises;

class Program
{
  public static void main(String[] args)
  {
    Stack stack = new Stack();

    stack.push(5);
    stack.push(3);
    stack.push(2);
    stack.push(9);

    System.out.format("The last value pushed was %d", stack.top());

    while (!stack.isEmpty())
    {
      System.out.format("Popping %d", stack.pop());
    }
  }
}
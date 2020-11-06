package Exercises;

class StackList {
	  class Node {
	    public int Value;
	    public Node Next;
	  }

	  // Hard code the size for now.
	  private Node head;
	  private int count = 0;

	  public void push(int value) {
		  Node newNode = new Node();

				    newNode.Value = value;

				    if (head == null)
				    {
				        head = newNode;
				    }
				    else
				    {
				    	
				       newNode.Next=head;
				       head = newNode;
				    }
	    count++;
	  }

	  public int pop() {
	    count--;
	    int val = head.Value;
	    head = head.Next;
	    return val;
	    
	  }

	  public int top() {
	    return head.Value;
	  }

	  public boolean isEmpty() {
	    return count == 0;
	  }
	}

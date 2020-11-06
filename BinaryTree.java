package Exercises;

class BinaryTree {
	  class Node {
	    public int Value;
	    public Node Left;
	    public Node Right;
	  }
	  
	  private Node root;
	  
	  public void add(int value)
	  {
	    Node newNode = new Node();

	    newNode.Value = value;

	    if (root == null)
	    {
	        root = newNode;
	    }
	    else
	    {
	        Node node = root;

	        while (node != null)
	        {
	            if (value < node.Value)
	            {
	                if (node.Left == null)
	                {
	                    node.Left = newNode;
	                    break;
	                }
	                node = node.Left;
	            }
	            else
	            {
	                if (node.Right == null)
	                {
	                    node.Right = newNode;
	                    break;
	                }
	                node = node.Right;
	            }
	        }
	    }
	  }
	  
	  public void printInOrder() {
		  printTheRest(root);
		  
	  }
	  public void printTheRest(Node node) {
		  
		  if(node != null) {
			  
			  printTheRest(node.Left);
			  System.out.print(node.Value + ", ");
			  printTheRest(node.Right);
		  }
	  }
	}

package Exercises;

class Main {
	  public static void main(String[] args)
	  {
	    BinaryTree tree = new BinaryTree();
	    
	    tree.add(50);
	    tree.add(30);
	    tree.add(10);
	    tree.add(40);
	    tree.add(80);
	    tree.add(70);
	    tree.add(90);
	    
	    tree.printInOrder();
	  }
	}
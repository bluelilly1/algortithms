package Exercises;

class SetMain {
	  public static void main(String[] args) {
	    Set set = new Set();
	    
	    set.add(2);
	    set.add(4);
	    set.add(3);
	    set.add(2);
	    set.print("Set:");
	    
	    Set set2 = new Set();
	    set2.add(2);
	    set2.add(3);
	    set2.print("Set2:");
	    
	    if (set2.isSubSet(set))
	    {
	      System.out.println("set2 is subset to set");
	    }
	    else
	    {
	      System.out.println("set2 is NOT subset to set");
	    }
	  }
	}

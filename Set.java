package Exercises;

class Set {
	  private int count;
	  private int[] set = new int[10];
	  
	  public void add(int value)
	  {
	    int index = 0;
	    
	    for (; index < count; index++)
	    {
	      if (set[index] == value)
	      {
	        return;
	      }
	    }
	    
	    set[count] = value;
	    count++;
	  }
	  
	  public boolean isSubSet(Set otherSet)
	  {
		boolean isSubset = false;
		/*for (int index = 0; index < count; index++) {
			for (int otherIndex = 0; otherIndex < count; otherIndex++) {
			if (otherSet.set[otherIndex] != set[index]) {
				isSubset = false;
				
				
			}
			else {
				isSubset = true;
				continue;
			}
			}
		}*/
		for (int index = 0; index < count; index++)
	    {
			for (int otherIndex = 0; otherSet.set[otherIndex] < count) {
		      if (set[index] == value)
		      {
		        return;
		      }
	    }
	    }
		return isSubset;
	     
	  }
	  
	  public void print(String title)
	  {
	    System.out.print(title + "[");
	    
	    for (int index = 0; index < count; index++)
	    {
	      if (index > 0)
	      {
	        System.out.print(", ");
	      }
	      
	      System.out.print(set[index]);
	    }
	    System.out.println("]");
	  }
	}

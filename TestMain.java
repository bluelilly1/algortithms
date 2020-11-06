package Exercises;

class TestMain {
	  public static void main(String[] args) throws Exception {
	    DynArray da = new DynArray(2);

	    System.out.format("da.Count = %d\n", da.Capacity());
	    da.Add(1);
	    da.Add(2);
	    da.Add(3);
	    da.Add(4);
	    da.Add(5);
	    da.Add(6);
	    System.out.format("da.Count = %d\n", da.Capacity());

	    for (int index = 0; index < da.Length(); index++)
	    {
	      System.out.format("%d ", da.get(index));
	    }
	    System.out.println();
	  }
	}
	
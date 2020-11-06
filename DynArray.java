package Exercises;

class DynArray {
	  private static final int DefaultValue = 3;
	  private int[] array;
	  private int length;

	  public DynArray() {
	    this(DefaultValue);
	  }

	  public DynArray(int initialSize) {
	    array = new int[initialSize];
	    length = 0;
	  }

	  public int Length()
	  {
		
	    return length;
	  }

	  public int Capacity()
	  {
	    return array.length;
	  }

	  public int get(int index) throws Exception {
	    if (index >= length)
	    {
	      throw new Exception();
	    }
	    return array[index];
	  }

	  public void set(int index, int value) throws Exception {
	    if (index >= length)
	    {
	      throw new Exception();
	    }
	    array[index] = value;
	  }

	  public void Add(int v) {
		if (length >= array.length) {
		  ResizeArray(array.length);
		}
	    array[length] = v;
	    length++;
	  }

	  private void ResizeArray(int capacity) {
		  int [] bigger = new int [capacity+1];
		    for (int i = 0; i < capacity; i++) {
		    	bigger[i] = array[i];
		    }
		    array = bigger;
	  }
	}

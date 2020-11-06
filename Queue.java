package Exercises;

class Queue {
	  private static final int DefaultSize = 10;
	  private int[] array;
	  private int head = 0;
	  private int tail = 0;
	  private int count = 0;

	  public Queue() {
	    this(DefaultSize);
	  }

	  public Queue(int initialSize) {
	    array = new int[initialSize];
	  }
	  public void enqueue(int value) {
		  
		  
		  array[tail] = value;
		  tail++;
		  if (tail > array.length-1) {
			  tail = 0;
		  }
		  
	  }
	  public int count() {
		  count = tail-head;
		  return count;
	  }
	  public String dequeue() {
		  int [] dequeue = new int[array.length-1];
		  
		  int result = array[head];
		  head++;
		  //add all values except the head
		  for (int i = head+1; i < dequeue.length; i++) {
			  dequeue[i] = array[i];
		  }
		  array = dequeue;
		 
		  return String.valueOf(result);
		  
	  }
	  
	}


package Exercises;

class programForQueue {
	  public static void main(String[] args) {
	    Queue q = new Queue();

	    q.enqueue(5);
	    q.enqueue(3);
	    q.enqueue(13);
	    q.enqueue(8);
	    q.enqueue(2);
	    q.enqueue(1);

	    while (q.count() > 0) {
	      System.out.println("Dequeue " + q.dequeue());
	    }

	    // Do this again to see how
	    // head and tail are wrapping around the array.
	    q.enqueue(15);
	    q.enqueue(13);
	    q.enqueue(113);
	    q.enqueue(18);
	    q.enqueue(12);
	    q.enqueue(11);

	    while (q.count() > 0) {
	      System.out.println("Dequeue " + q.dequeue());
	    }
	  }
	}
	